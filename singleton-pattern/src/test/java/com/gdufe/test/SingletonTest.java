package com.gdufe.test;

import com.gdufe.DCLSingleton;
import com.gdufe.StaticCodeBlockSingleton;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: laichengfeng
 * @Description: 测试各种单例模式的性能, 顺带温习了下自己创建线程池
 * @Date: 2018/7/27 11:30
 */
public class SingletonTest {

    private static ThreadPoolExecutor threadPoolExecutor = null;

    /**
     * 创建线程池
     * 部分代码参考JDK 1.5
     * {@link Executors.DefaultThreadFactory}
     *
     *  构造线程池的7大参数
     *  int corePoolSize,                  - 核心池大小
     *  int maximumPoolSize,               - 池的最大线程数
     *  long keepAliveTime,                - 空闲线程等待时间
     *  TimeUnit unit,                     - 时间单位
     *  BlockingQueue<Runnable> workQueue, - 储存等待执行的任务队列
     *     + {@link ArrayBlockingQueue}:                           - 一个由数组结构组成的有界阻塞队列。
     *     + {@link LinkedBlockingQueue}:                          - 一个由链表结构组成的无界阻塞队列。
     *     + {@link PriorityBlockingQueue}:                        - 一个支持优先级排序的无界阻塞队列。
     *     + {@link DelayQueue}:                                   - 一个使用优先级队列实现的无界阻塞队列。
     *     + {@link SynchronousQueue}:                             - 一个不存储元素的阻塞队列。
     *     + {@link LinkedTransferQueue}:                          - 一个由链表结构组成的无界阻塞队列。
     *     + {@link LinkedBlockingDeque}:                          - 一个由链表结构组成的双向阻塞队列。
     *  ThreadFactory threadFactory,       - 线程工厂
     *  RejectedExecutionHandler handler   - 拒绝策略               - 可自定义拒绝策略, 通过实现{@link RejectedExecutionHandler}
     *     + {@link ThreadPoolExecutor.AbortPolicy}:               - 丢弃任务并抛出RejectedExecutionException异常。 (默认)
     *     + {@link ThreadPoolExecutor.DiscardPolicy}:             - 也是丢弃任务，但是不抛出异常。
     *     + {@link ThreadPoolExecutor.DiscardOldestPolicy}:       - 丢弃队列最前面的任务，然后重新尝试执行任务（重复此过程）
     *     + {@link ThreadPoolExecutor.CallerRunsPolicy}:          - 由调用线程处理该任务
     */
    private ThreadPoolExecutor createDefaultThreadPoolExecutor(int corePoolSize, int maximumPoolSize) {

        long keepAliveTime = 0;
        TimeUnit unit = TimeUnit.MILLISECONDS;
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>();
        ThreadFactory threadFactory = new ThreadFactory() {
            // Java安全管理器, 主要是一些系统的权限管理
            SecurityManager s = System.getSecurityManager();
            // 线程安全, 使用CAS实现
            private final AtomicInteger poolNumber = new AtomicInteger(1);
            private final ThreadGroup threadGroup = (s != null) ? s.getThreadGroup()
                    : Thread.currentThread().getThreadGroup();
            private final AtomicInteger threadNumber = new AtomicInteger(1);
            private final String namePrefix = "pool-" + poolNumber.getAndIncrement() + "-thread-";

            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(threadGroup, r, namePrefix + threadNumber.getAndIncrement());
                // 设置为非守护线程, 随着主线程结束而结束
                if(thread.isDaemon()) {
                    thread.setDaemon(false);
                }
                // 将线程的优先级都设为5 (即正常的优先级)
                // 小提示: 线程优先级高, 并不一定代表此线程先调度
                if(thread.getPriority() != Thread.NORM_PRIORITY) {
                    thread.setPriority(Thread.NORM_PRIORITY);
                }
                return thread;
            }
        };
        RejectedExecutionHandler handler = new ThreadPoolExecutor.AbortPolicy();
        threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
                threadFactory, handler);
        return threadPoolExecutor;
    }

    /**
     * 查找Map中对应最大value的key, 目前只能通过遍历一次来获取
     * TODO 可否优化?
     * 提升至可用类方法层面时, 可将Object和Long改为泛型
     * 当然了, 这个方法主要是针对Map中第二个参数类型为数值时的操作, 所以需要继承{@link Number}
     *
     * @param map
     * @return
     */
    private long getKeyForMaxValue(Map<Long, Long> map) {
        long maxValue = Long.MIN_VALUE;
        long key = -1;
        for(Map.Entry<Long, Long> entry: map.entrySet()) {
            final long value = entry.getValue();
            if(maxValue < value) {
                maxValue = value;
                key = entry.getKey();
            }
        }
        return key;
    }

//    @Before
    public void setUp() throws Exception {
        threadPoolExecutor = createDefaultThreadPoolExecutor(Runtime.getRuntime().availableProcessors()+1, 10);
    }

    /**
     * 结果: (受电脑影响有点严重, 自我感觉不太准确)
     *
     * taskCount: 5, scope: 0-56 MILLISECONDS, often: 1
     * taskCount: 25, scope: 2-85 MILLISECONDS, often: 3
     * taskCount: 45, scope: 3-12 MILLISECONDS, often: 4
     * taskCount: 65, scope: 5-13 MILLISECONDS, often: 6
     * taskCount: 85, scope: 6-61 MILLISECONDS, often: 8
     * taskCount: 105, scope: 8-25 MILLISECONDS, often: 10
     * taskCount: 125, scope: 10-148 MILLISECONDS, often: 12
     * taskCount: 145, scope: 12-65 MILLISECONDS, often: 14
     * taskCount: 165, scope: 14-150 MILLISECONDS, often: 19
     * taskCount: 185, scope: 15-490 MILLISECONDS, often: 18
     * taskCount: 205, scope: 17-233 MILLISECONDS, often: 20
     * taskCount: 225, scope: 19-391 MILLISECONDS, often: 22
     * taskCount: 245, scope: 20-164 MILLISECONDS, often: 24
     * taskCount: 265, scope: 22-61 MILLISECONDS, often: 26
     * taskCount: 285, scope: 24-48 MILLISECONDS, often: 28
     * taskCount: 305, scope: 25-51 MILLISECONDS, often: 30
     * taskCount: 325, scope: 27-56 MILLISECONDS, often: 32
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    @SuppressWarnings("all")
    public void testDCLSingleton() throws ExecutionException, InterruptedException {
        int loopCount = 10000;
        for(int taskCount = 5; taskCount <= 1000; taskCount +=20) {
            long minTime = Long.MAX_VALUE;
            long maxTime = Long.MIN_VALUE;
            // 存储每个耗时出现的次数
            Map<Long, Long> oftenMap = new HashMap<>();
            for (int loop = 0; loop < loopCount; loop++) {
                threadPoolExecutor = createDefaultThreadPoolExecutor(taskCount, taskCount);
                long start = System.currentTimeMillis();
                // 小提示: 事先知道集合大小时, 最好指定初始化容量, 减少集合容量扩增所带来的复制操作耗时
                List<Future<DCLSingleton>> futureResult = new ArrayList<>(taskCount);
                for (int i = 0; i < taskCount; i++) {
                    futureResult
                            .add(threadPoolExecutor.submit(new Callable<DCLSingleton>() {
                                @Override
                                public DCLSingleton call() throws Exception {
                                    return DCLSingleton.getInstance();
                                }
                            }));
                }
                DCLSingleton dCLSingleton = futureResult.get(0).get();
                boolean verify = true;
                for (int i = 1; i < taskCount; i++) {
                    if (dCLSingleton != futureResult.get(i).get()) {
                        verify = false;
                    }
                }
                // 关闭线程池 (小提示: 关闭只是意味着不能再加任务了, 加进去的任务还是会执行完的)
                threadPoolExecutor.shutdown();
                // 等待线程池中的所有任务执行完
                while (!threadPoolExecutor.awaitTermination(1, TimeUnit.SECONDS));
                // 验证单例的正确性
                Assert.assertTrue(verify);
                long end = System.currentTimeMillis();
                long time = end - start;
                if (time < minTime) {
                    minTime = time;
                }
                if (time > maxTime) {
                    maxTime = time;
                }
                // 记录
                if(oftenMap.containsKey(time)) {
                    oftenMap.put(time, oftenMap.get(time) + 1);
                } else {
                    oftenMap.put(time, 1L);
                }
            }
            long key = getKeyForMaxValue(oftenMap);
            System.out.println("taskCount: "+ taskCount +", scope: " + minTime + "-"+maxTime+" MILLISECONDS, often: " + key);
            Thread.sleep(100);
        }
    }

    @Test
    public void testEnumSingleton() {

    }

    @Test
    public void testHungrySingletion() {

    }

    @Test
    public void testLazyThreadNoSafe() {

    }

    @Test
    public void testLazyThreadSafe() {

    }

    @Test
    public void testStaticInnerSingleton() {

    }

    @Test
    public void testStaticCodeBlockSingleton(){
        Object objectTemp = StaticCodeBlockSingleton.getMyObject();
        String temp = objectTemp.toString();
        System.out.println(temp);
        for(int i=0 ;i<100 ;i++){
            Object object = StaticCodeBlockSingleton.getMyObject();
            if(object.toString().equals(temp)){

            }else{
                System.out.println("we are different");
            }
        }
    }
}

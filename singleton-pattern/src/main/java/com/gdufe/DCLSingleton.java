package com.gdufe;

/**
 * @Author: laichengfeng
 * @Description: 双重校验锁实现, Lazy加载, 线程安全, 效率高, 可使用
 * @Date: 2018/7/26 18:50
 */
public class DCLSingleton {
    // 加上volatile修饰, 增加可见性, 如果没加, 会导致对象已经被实例化, 但其他线程在同步外部的if(null == instance)代码块为真
    // 导致又新建了一个实例对象
    private static volatile DCLSingleton instance;

    private DCLSingleton() {
        //防止通过反射创建实例
        if(null == instance) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static DCLSingleton getInstance() {
        // 加上局部变量可以提高 25% 的性能(来源于Effective Java 2, p. 283-284)
        DCLSingleton result = instance;
        if(null == instance) {
            synchronized (DCLSingleton.class) {
                // 及时更新result(防止一个线程已经实例化instance, 但其他线程中result仍然是null)
                // TODO 对于对象引用, instance被实例化, 是否意味着result已经不为null
                result = instance;
                // 内层再次判断, 防止后面的线程在上一个线程释放锁后再次new了一个实例
                if(null == result) {
                    instance = result = new DCLSingleton();
                }
            }
        }
        return result;
    }
}

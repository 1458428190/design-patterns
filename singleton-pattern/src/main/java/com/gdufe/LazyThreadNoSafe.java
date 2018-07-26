package com.gdufe;

/**
 * @Author: laichengfeng
 * @Description: 懒汉式线程不安全, 不推荐使用
 * @Date: 2018/7/26 18:04
 */
public class LazyThreadNoSafe {
    private static LazyThreadNoSafe instance;

    private LazyThreadNoSafe() {
        //防止通过反射创建实例
        if(null == instance) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * 多线程环境下不安全, 多个线程同时进入, 并到达if(null == instance)中, 判断为null, 出现问题
     * 
     * @return
     */
    public static LazyThreadNoSafe getInstance() {
        if (null == instance) {
            instance = new LazyThreadNoSafe();
        }
        return instance;
    }
}

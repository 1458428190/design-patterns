package com.gdufe;

/**
 * @Author: laichengfeng
 * @Description: 懒汉式线程安全, 不推荐使用
 * @Date: 2018/7/26 18:07
 */
public class LazyThreadSafe {
    private static LazyThreadSafe instance;

    private LazyThreadSafe() {
        //防止通过反射创建实例
        if(null == instance) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * 加上同步机制, 但效率低
     * @return
     */
    public static synchronized LazyThreadSafe getInstance() {
        if(null == instance) {
            instance = new LazyThreadSafe();
        }
        return instance;
    }
}

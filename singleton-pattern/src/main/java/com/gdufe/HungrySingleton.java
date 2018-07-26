package com.gdufe;

/**
 * @Author: laichengfeng
 * @Description: 饿汉式 线程安全, 但容易产生垃圾对象, 可使用
 * @Date: 2018/7/26  18:46
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        //防止通过反射创建实例
        if(null == instance) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}

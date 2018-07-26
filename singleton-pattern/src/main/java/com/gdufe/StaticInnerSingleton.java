package com.gdufe;

/**
 * @Author: laichengfeng
 * @Description: 静态内部类实现形式, 可使用
 * @Date: 2018/7/26 19:02
 */
public class StaticInnerSingleton {
    private static class StaticInnerSingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    /**
     * TODO 利用反射?待测试
     */
    private StaticInnerSingleton() {}

    /**
     * 只有当调用这个getInstance时, INSTANCE才会被初始化
     * @return
     */
    public static StaticInnerSingleton getInstance() {
        return StaticInnerSingletonHolder.INSTANCE;
    }
}

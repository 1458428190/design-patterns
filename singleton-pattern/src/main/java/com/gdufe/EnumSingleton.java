package com.gdufe;

/**
 * @Author: laichengfeng
 * @Description: 使用枚举实现单例, 线程安全且简单, 自动支持序列化机制, 没有Lazy初始化, 推荐使用
 * @Date: 2018/7/26  17:49
 */
public enum EnumSingleton {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}

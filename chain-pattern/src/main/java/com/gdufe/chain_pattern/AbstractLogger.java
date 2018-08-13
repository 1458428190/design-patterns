package com.gdufe.chain_pattern;

/**
 * @Author: laichengfeng
 * @Description: 抽象日志
 * @Date: 2018/7/31 23:43
 */
public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    // 下一个处理器
    protected AbstractLogger next;

    protected int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger next){
        this.next = next;
    }

    public void logMessage(int level, String message) {
        if(this.level <= level) {
            write(message);
        }
        if(null != next) {
            next.logMessage(level, message);
        }
    }

    protected abstract void write(String message);
}

package com.gdufe.chain_pattern;

/**
 * @Author: laichengfeng
 * @Description: 控制台日志
 * @Date: 2018/7/31 23:48
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Console Logger:" + message);
    }
}

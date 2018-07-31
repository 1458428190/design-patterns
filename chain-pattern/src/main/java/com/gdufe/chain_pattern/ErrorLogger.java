package com.gdufe.chain_pattern;

/**
 * @Author: laichengfeng
 * @Description: 错误日志
 * @Date: 2018/7/31 23:49
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error LOGGER: " + message);
    }
}

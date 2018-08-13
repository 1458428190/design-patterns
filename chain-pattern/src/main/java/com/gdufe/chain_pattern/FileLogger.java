package com.gdufe.chain_pattern;

import java.io.File;

/**
 * @Author: laichengfeng
 * @Description: 文件日志
 * @Date: 2018/7/31 23:51
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("File LOGGER: " + message);
    }
}

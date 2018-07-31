package com.gdufe.chain_pattern;

/**
 * @Author: laichengfeng
 * @Description: 责任链模式客户端
 * @Date: 2018/7/31 23:10
 */
public class App {

    private static AbstractLogger getChainAbstractLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger console = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(console);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger chain = getChainAbstractLogger();
        chain.logMessage(AbstractLogger.INFO, " [op_rslt: done]");
        chain.logMessage(AbstractLogger.DEBUG, " [op_rslt: warn]");
        chain.logMessage(AbstractLogger.ERROR, " [op_rslt: error]");
    }
}

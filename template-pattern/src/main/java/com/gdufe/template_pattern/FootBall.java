package com.gdufe.template_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/7 21:34
 */
public class FootBall extends Game {
    @Override
    void initialize() {
        System.out.println("initialize football");
    }

    @Override
    void startPlay() {
        System.out.println("startPlay football");
    }

    @Override
    void endPlay() {
        System.out.println("endplay football");
    }

    protected boolean isValid() {
        return false;
    }
}

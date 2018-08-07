package com.gdufe.template_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/7 21:31
 */
public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("initialize Cricket");
    }

    @Override
    void startPlay() {
        System.out.println("startPlay cricket");
    }

    @Override
    void endPlay() {
        System.out.println("endplay cricket");
    }

    protected boolean isValid() {
        return false;
    }
}

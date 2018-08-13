package com.gdufe.template_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/7 21:29
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    // 模板
    public void play() {
        initialize();
        if(isValid()) {
            startPlay();
        }
        endPlay();
    }

    // 钩子方法
    private boolean isValid() {
        return true;
    }
}

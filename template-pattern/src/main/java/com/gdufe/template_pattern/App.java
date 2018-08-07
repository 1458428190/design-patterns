package com.gdufe.template_pattern;

/**
 * @Author: laichengfeng
 * @Description: 模板方法模式
 * @Date: 2018/8/7 21:28
 */
public class App {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        game = new FootBall();
        game.play();
    }
}

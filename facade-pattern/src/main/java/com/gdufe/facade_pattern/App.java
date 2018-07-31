package com.gdufe.facade_pattern;

/**
 * @Author: laichengfeng
 * @Description: 适用于封装某个操作很多的场景
 * @Date: 2018/7/30 22:34
 */
public class App {
    public static void main(String[] args) {
        GeneralSwitchFacade generalSwitchFacade = new GeneralSwitchFacade();
        generalSwitchFacade.on();
        System.out.println("-------------------------------------------");
        generalSwitchFacade.off();
    }
}

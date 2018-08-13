package com.gdufe.observer_pattern;

/**
 * @Author: laichengfeng
 * @Description: 具体观察者类
 * @Date: 2018/8/4 16:37
 */
public class Dog extends MyObserver {
    @Override
    public void response() {
        System.out.println("狗也开始叫");
    }
}

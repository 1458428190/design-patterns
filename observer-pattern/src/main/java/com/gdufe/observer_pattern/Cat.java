package com.gdufe.observer_pattern;

/**
 * @Author: laichengfeng
 * @Description: 具体目标类
 * @Date: 2018/8/4 16:35
 */
public class Cat extends MySubject {
    @Override
    public void cry() {
        System.out.println("猫叫了");
        for(MyObserver observer: list){
            observer.response();
        }
    }
}

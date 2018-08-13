package com.gdufe.observer_pattern;

/**
 * @Author: laichengfeng
 * @Description: 观察者模式
 * @Date: 2018/8/4 16:31
 */
public class App {
    public static void main(String[] args) {
        MySubject cat = new Cat();
        cat.attach(new Mouse());
        cat.attach(new Dog());
        cat.cry();
    }
}

package com.gdufe.abstractfactorypattern;

/**
 * @Author: laichengfeng
 * @Description: 具体类 圆
 * @Date: 2018/7/26  15:28
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw circle");
    }
}



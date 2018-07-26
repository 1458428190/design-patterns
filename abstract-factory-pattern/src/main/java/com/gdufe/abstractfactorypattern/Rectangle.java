package com.gdufe.abstractfactorypattern;

/**
 * @Author: laichengfeng
 * @Description: 具体类 长方形
 * @Date: 2018/7/26  15:31
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}

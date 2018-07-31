package com.gdufe.decorator_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/30  21:07
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

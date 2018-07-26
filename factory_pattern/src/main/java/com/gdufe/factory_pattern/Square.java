package com.gdufe.factory_pattern;

/**
 * @Author: laichengfeng
 * @Description: 具体类 正方形
 * @Date: 2018/7/26  15:30
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}

package com.gdufe.bridge_pattern;

/**
 * @Author: laichengfeng
 * @Description: 具体交通工具类
 * @Date: 2018/7/30  19:45
 */
public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("drive car");
    }
}

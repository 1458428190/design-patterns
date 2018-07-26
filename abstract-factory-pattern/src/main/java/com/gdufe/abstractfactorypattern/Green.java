package com.gdufe.abstractfactorypattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/26  16:03
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("fill green");
    }
}

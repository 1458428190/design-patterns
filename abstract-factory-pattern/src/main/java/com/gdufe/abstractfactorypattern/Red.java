package com.gdufe.abstractfactorypattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/26  16:02
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("fill red");
    }
}

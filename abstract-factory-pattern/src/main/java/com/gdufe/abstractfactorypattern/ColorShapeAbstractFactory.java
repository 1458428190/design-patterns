package com.gdufe.abstractfactorypattern;

/**
 * @Author: laichengfeng
 * @Description: 抽象工厂类
 * @Date: 2018/7/26 16:00
 */
public abstract class ColorShapeAbstractFactory {

    public abstract Shape createShape();

    public abstract Color createColor();
}

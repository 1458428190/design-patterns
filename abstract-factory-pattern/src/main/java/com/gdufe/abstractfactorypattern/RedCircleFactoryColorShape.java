package com.gdufe.abstractfactorypattern;

/**
 * @Author: laichengfeng
 * @Description: 具体RedColor产品工厂
 * @Date: 2018/7/26  16:11
 */
public class RedCircleFactoryColorShape extends ColorShapeAbstractFactory {

    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}

package com.gdufe.abstractfactorypattern;

/**
 * @Author: laichengfeng
 * @Description: 具体 BlueRectangle工厂
 * @Date: 2018/7/26 16:51
 */
public class BlueRectangleFactoryColorShape extends ColorShapeAbstractFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}

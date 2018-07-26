package com.gdufe.abstractfactorypattern;

/**
 * @Author: laichengfeng
 * @Description: 具体GreenSquare工厂
 * @Date: 2018/7/26  16:04
 */
public class GreenSquareFactoryColorShape extends ColorShapeAbstractFactory {

    @Override
    public Shape createShape() {
        return new Square();
    }

    @Override
    public Color createColor() {
        return new Green();
    }
}

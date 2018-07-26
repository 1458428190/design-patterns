package com.gdufe.abstractfactorypattern;

/**
 * @Author: laichengfeng
 * @Description: 产品生产
 * @Date: 2018/7/26  16:18
 */
public class FactoryProducer {
    public static ColorShapeAbstractFactory makeFactory(ColorShapeType type){
        switch (type) {
            case RED_CIRCLE: return new RedCircleFactoryColorShape();
            case GREEN_SQUARE: return new GreenSquareFactoryColorShape();
            case BLUE_RECTANGLE: return new BlueRectangleFactoryColorShape();
            default: throw new IllegalArgumentException("no support the type");
        }
    }

    public enum ColorShapeType {
        RED_CIRCLE, GREEN_SQUARE, BLUE_RECTANGLE;
    }
}

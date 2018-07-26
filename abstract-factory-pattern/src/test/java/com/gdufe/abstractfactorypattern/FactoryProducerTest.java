package com.gdufe.abstractfactorypattern;

import org.junit.Test;

/**
 * @Author: laichengfeng
 * @Description: 测试类
 * @Date: 2018/7/26  16:21
 */
@SuppressWarnings("all")
public class FactoryProducerTest {

    @Test
    public void testFactoryProducer() {

        ColorShapeAbstractFactory shapeFacotry = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFacotry.createShape("CIRCLE");
        circle.draw();
        Shape square = shapeFacotry.createShape("SQUARE");
        square.draw();
        Shape rectangle = shapeFacotry.createShape("RECTANGLE");
        rectangle.draw();

        ColorShapeAbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color red = colorFactory.createColor("RED");
        red.fill();
        Color blue = colorFactory.createColor("BLUE");
        blue.fill();
        Color green = colorFactory.createColor("GREEN");
        green.fill();
    }
}
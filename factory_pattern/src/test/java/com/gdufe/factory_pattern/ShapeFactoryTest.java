package com.gdufe.factory_pattern;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: laichengfeng
 * @Description: 测试类
 * @Date: 2018/7/26  15:37
 */
public class ShapeFactoryTest {

    /**
     * TODO 思考: 这样与 Shape shape1 = new Circle();的区别是?
     */
    @Test
    public void testFactory() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();
        Shape shape4 = shapeFactory.getShape("NULL");
        Assert.assertNull(shape4);
    }
}
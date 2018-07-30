package com.gdufe.decorator_pattern;

/**
 * @Author: laichengfeng
 * @Description: 抽象装饰者类
 * @Date: 2018/7/30  21:08
 */
public abstract class ShapeDecorator implements Shape{

    private Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}

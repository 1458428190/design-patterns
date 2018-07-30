package com.gdufe.decorator_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/30  21:10
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("set Red border!");
    }
}

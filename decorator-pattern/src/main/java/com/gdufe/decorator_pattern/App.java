package com.gdufe.decorator_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/30  21:06
 */
public class App {
    public static void main(String[] args) {
        Shape redCircle = new RedShapeDecorator(new Cricle());
        redCircle.draw();
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}

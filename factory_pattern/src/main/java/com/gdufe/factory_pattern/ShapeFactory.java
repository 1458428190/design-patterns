package com.gdufe.factory_pattern;

import org.apache.commons.lang.StringUtils;

/**
 * @Author: laichengfeng
 * @Description: 抽象工厂类
 * @Date: 2018/7/26  15:33
 */
@SuppressWarnings("all")
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(StringUtils.isEmpty(shapeType)) {
            return null;
        }
        switch (shapeType) {
            case "CIRCLE": return new Circle();
            case "SQUARE": return new Square();
            case "RECTANGLE": return new Rectangle();
            default: return null;
        }
    }
}

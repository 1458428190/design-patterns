package com.gdufe.abstractfactorypattern;

import lombok.Data;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * @Author: laichengfeng
 * @Description: 产品类
 * @Date: 2018/7/26 16:54
 */
@Data
public class ColorShape {

    private Shape shape;

    private Color color;

    /**
     * 小提示: 方法参数加上final 是为了防止不变的参数出现一些错误(如方法体中对其进行了修改)
     * @param factory
     */
    public void createColorShape(final ColorShapeAbstractFactory factory) {
        setShape(factory.createShape());
        setColor(factory.createColor());
    }
}

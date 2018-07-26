package com.gdufe.abstractfactorypattern;

import org.apache.commons.lang.StringUtils;

/**
 * @Author: laichengfeng
 * @Description: 工厂创造器
 * @Date: 2018/7/26  16:18
 */
public class FactoryProducer {
    public static ColorShapeAbstractFactory getFactory(String factoryType) {
        // TODO 太多重复代码, 改为AOP切入判断?
        if(StringUtils.isEmpty(factoryType)) {
            return null;
        }
        switch (factoryType) {
            case "COLOR": return new RedCircleFactoryColorShape();
            case "SHAPE": return new GreenSquareFactoryColorShape();
            default: return null;
        }
    }
}

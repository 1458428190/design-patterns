package com.gdufe.visitor_pattern;

/**
 * @Author: laichengfeng
 * @Description: 具体产品类
 * @Date: 2018/8/7 21:53
 */
public class Apple implements Product{
    @Override
    public void accpet(Visitor visitor) {
        visitor.visit(this);
    }
}

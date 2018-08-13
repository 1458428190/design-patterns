package com.gdufe.visitor_pattern;

/**
 * @Author: laichengfeng
 * @Description: 抽象产品类
 * @Date: 2018/8/7 21:56
 */
public interface Product {
    void accpet(Visitor visitor);
}

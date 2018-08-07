package com.gdufe.visitor_pattern;

/**
 * @Author: laichengfeng
 * @Description: 具体访问者
 * @Date: 2018/8/7 21:55
 */
public class Saler extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("收银员" + name + "卖苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println("收银员" + name + "卖书");
    }
}

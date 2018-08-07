package com.gdufe.visitor_pattern;

/**
 * @Author: laichengfeng
 * @Description: 具体访问者
 * @Date: 2018/8/7 21:54
 */
public class Customer extends Visitor {
    @Override
    public void visit(Apple apple) {
        System.out.println("顾客" + name + "买苹果");
    }

    @Override
    public void visit(Book book) {
        System.out.println("顾客" + name + "买书");
    }
}

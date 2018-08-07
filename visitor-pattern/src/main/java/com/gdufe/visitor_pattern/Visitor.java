package com.gdufe.visitor_pattern;

/**
 * @Author: laichengfeng
 * @Description: 抽象访问者类
 * @Date: 2018/8/7 21:52
 */
public abstract class Visitor {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void visit(Apple apple);
    public abstract void visit(Book book);
}

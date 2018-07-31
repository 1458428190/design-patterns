package com.gdufe.decorator_pattern.decorator_pattern_example;

/**
 *  基类(包装类包含这个基类)
 *  Beverage : 饮料
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}

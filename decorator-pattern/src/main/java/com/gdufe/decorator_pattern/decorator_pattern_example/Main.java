package com.gdufe.decorator_pattern.decorator_pattern_example;

/**
 *  测试
 *  给饮料(浓咖啡)加上配料
 */
public class Main {
    public static void main(String [] args) {
        Beverage beverage = new Espresso();
        //给Espresso加两份Mocha和一份Soy
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        System.out.println("description:" +beverage.getDescription()+",cost:"+beverage.cost());
    }

}

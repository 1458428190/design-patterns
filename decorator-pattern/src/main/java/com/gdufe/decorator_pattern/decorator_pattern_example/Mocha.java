package com.gdufe.decorator_pattern.decorator_pattern_example;

/**
 *  配料 ： Mocha(抹茶)
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(){

    }

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription()+" , Mocha";
    }

    public double cost(){
        return 0.20 + beverage.cost();
    }
}

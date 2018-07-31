package com.gdufe.decorator_pattern.decorator_pattern_example;

/**
 *  配料 ： Soy(豆浆)
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " , Soy";
    }

    public double cost() {
        return 0.30 + beverage.cost();
    }

}
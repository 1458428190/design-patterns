package com.gdufe.decorator_pattern.decorator_pattern_example;

/**
 *  Espresso : 浓咖啡
 */
public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

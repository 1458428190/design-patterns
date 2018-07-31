package com.gdufe.builderpattern;

/**
 * @Author: laichengfeng
 * @Description: 具体建造者B
 * @Date: 2018/7/29 17:31
 */
public class SubMealBuilderB extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setFood("food B");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("drink B");
    }
}

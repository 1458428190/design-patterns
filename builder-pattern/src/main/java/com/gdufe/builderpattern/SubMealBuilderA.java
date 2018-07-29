package com.gdufe.builderpattern;

/**
 * @Author: laichengfeng
 * @Description: 具体建造者A
 * @Date: 2018/7/29 17:27
 */
public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("food A");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("drink A");
    }
}

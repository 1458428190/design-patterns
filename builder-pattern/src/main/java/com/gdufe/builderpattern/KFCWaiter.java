package com.gdufe.builderpattern;

import lombok.Setter;

/**
 * @Author: laichengfeng
 * @Description: 指挥者
 * @Date: 2018/7/29 17:33
 */
@Setter
public class KFCWaiter {
    private MealBuilder mealBuilder;

    /**
     * 构造产品
     * @return
     */
    public Meal construct() {
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}

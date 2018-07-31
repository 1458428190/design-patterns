package com.gdufe.builderpattern;

import org.junit.Test;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/29 17:35
 */
public class KFCWaiterTest {

    @Test
    public void test1() {
        KFCWaiter kfcWaiter = new KFCWaiter();
        MealBuilder mealBuilderA = new SubMealBuilderA();
        kfcWaiter.setMealBuilder(mealBuilderA);
        Meal mealA = kfcWaiter.construct();
        System.out.println(mealA);

        MealBuilder mealBuilderB = new SubMealBuilderB();
        kfcWaiter.setMealBuilder(mealBuilderB);
        Meal mealB = kfcWaiter.construct();
        System.out.println(mealB);
    }
}

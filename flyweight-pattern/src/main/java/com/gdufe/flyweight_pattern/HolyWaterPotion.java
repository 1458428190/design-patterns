package com.gdufe.flyweight_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/31 21:55
 */
public class HolyWaterPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel blessed. Potion="+System.identityHashCode(this));
    }
}

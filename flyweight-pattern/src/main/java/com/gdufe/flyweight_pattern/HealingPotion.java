package com.gdufe.flyweight_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/31 21:54
 */
public class HealingPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("You feel healed. Potion=" + System.identityHashCode(this));
    }
}

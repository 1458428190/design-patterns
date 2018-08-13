package com.gdufe.flyweight_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/31 21:57
 */
public class InvisibilityPotion implements Potion {
    @Override
    public void drink() {
        System.out.println("you feel blessed. Potion="+System.identityHashCode(this));
    }
}

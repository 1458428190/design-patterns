package com.gdufe.flyweight_pattern;

import java.util.EnumMap;
import java.util.Map;

/**
 * @Author: laichengfeng
 * @Description: 享元池工厂
 * @Date: 2018/7/31 21:59
 */
public class PotionFactory {
    private final Map<PotionType, Potion> potions;

    private int totalPotionCount = 0;

    public PotionFactory() {
        potions = new EnumMap<>(PotionType.class);
    }

    Potion createPotion(PotionType type) {
        Potion potion = potions.get(type);
        if (null == potion) {
            switch (type) {
                case HEALING:
                    potion = new HealingPotion();
                    potions.put(PotionType.HEALING, potion);
                    break;
                case HOLY_WATER:
                    potion = new HolyWaterPotion();
                    potions.put(PotionType.HOLY_WATER, potion);
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    potions.put(PotionType.INVISIBILITY, potion);
                    break;
                default:
                    throw new IllegalArgumentException("param error");
            }
        }
        totalPotionCount++;
        return potion;
    }

    public int getTotalPotionCount() {
        return totalPotionCount;
    }

    public int getPotionCount() {
        return potions.size();
    }
}

package com.gdufe.flyweight_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/31 21:39
 */
public class App {
    public static void main(String[] args) {
        PotionFactory potionFactory = new PotionFactory();
        Potion healing = potionFactory.createPotion(PotionType.HEALING);
        healing.drink();
        Potion holyWater = potionFactory.createPotion(PotionType.HOLY_WATER);
        holyWater.drink();
        Potion invisibility = potionFactory.createPotion(PotionType.INVISIBILITY);
        invisibility.drink();
        System.out.println(potionFactory.getPotionCount());
        System.out.println(potionFactory.getTotalPotionCount());

        Potion healingCopy = potionFactory.createPotion(PotionType.HEALING);
        System.out.println(healingCopy == healing);
        healingCopy.drink();

        System.out.println(potionFactory.getPotionCount());
        System.out.println(potionFactory.getTotalPotionCount());
    }
}

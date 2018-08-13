package com.gdufe.strategy_pattern;

import org.junit.Test;

/**
 * @Author: laichengfeng
 * @Description: 策略模式, 区别于状态模式的是(状态模式是针对一个有多个状态的行为, 而策略是针对一种方法有多种实现)
 * @Date: 2018/8/6 22:23
 */
public class App {
    public static void main(String[] args) {
//        ArrayHandler arrayHandler = new ArrayHandler();
//        arrayHandler.setSort(new BubbleSort());
//        int[] arrs = new int[5];
//        arrs[0] = 1;
//        arrs[1] = 5;
//        arrs[2] = 3;
//        arrs[3] = 10;
//        arrs[4] = 8;
//        int[] sort = arrayHandler.sort(arrs, Sort.SortType.ASC);
//        System.out.println(sort);
//
//        int[] sort1 = arrayHandler.sort(arrs, Sort.SortType.DESC);
//        System.out.println(sort1);
    }

    @Test
    public void test() {
        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.setSort(new InsertionSort());
        int[] arrs = new int[5];
        arrs[0] = 1;
        arrs[1] = 5;
        arrs[2] = 3;
        arrs[3] = 10;
        arrs[4] = 8;
        int[] sort = arrayHandler.sort(arrs, Sort.SortType.ASC);
        for(int i=0; i<sort.length; i++)
        System.out.println(sort[i]);
        System.out.println("-------------------");
        sort = arrayHandler.sort(arrs, Sort.SortType.DESC);
        for(int i=0; i<sort.length; i++)
            System.out.println(sort[i]);
   }
}

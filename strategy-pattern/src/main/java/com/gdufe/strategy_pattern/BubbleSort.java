package com.gdufe.strategy_pattern;

/**
 * @Author: laichengfeng
 * @Description: 冒泡排序
 * @Date: 2018/8/6 22:30
 */
public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] arrs, SortType type) {
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (type == SortType.ASC ? arrs[i] > arrs[j] : arrs[i] < arrs[j]) {
                    int temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
        return arrs;
    }
}

package com.gdufe.strategy_pattern;

/**
 * @Author: laichengfeng
 * @Description: 选择排序
 * @Date: 2018/8/6 22:34
 */
public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] arrs, SortType type) {
        for (int i = 0; i < arrs.length; i++) {
            int temp = arrs[i];
            int position = i;
            for (int j = i + 1; j < arrs.length; j++) {
                if (type == SortType.ASC ? arrs[j] < temp : temp < arrs[j]) {
                    temp = arrs[j];
                    position = j;
                }
            }
            arrs[position] = arrs[i];
            arrs[i] = temp;
        }
        return arrs;
    }
}

package com.gdufe.strategy_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/6 22:39
 */
public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] arrs, SortType type) {
        for(int i=1; i<arrs.length; i++) {
            int temp = arrs[i];
            int position = i;
            for(int j=i; j>0; j--) {
                if(type==SortType.ASC?arrs[j-1]>temp:arrs[j-1]<temp) {
                    arrs[j] = arrs[j-1];
                    position = j-1;
                }
                else{
                    break;
                }
            }
            arrs[position] = temp;
        }
        return arrs;
    }
}

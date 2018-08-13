package com.gdufe.strategy_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/6 22:50
 */
public class ArrayHandler {
    private Sort sortObj;

    public void setSort(Sort sortObj) {
        this.sortObj = sortObj;
    }

    public int[] sort(int[] arrs, Sort.SortType type) {
        return sortObj.sort(arrs, type);
    }
}

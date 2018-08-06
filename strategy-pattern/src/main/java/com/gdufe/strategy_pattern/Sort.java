package com.gdufe.strategy_pattern;

/**
 * @Author: laichengfeng
 * @Description: 抽象策略类
 * @Date: 2018/8/6 22:29
 */
public interface Sort {
    int[] sort(int[] arrs, SortType type);

    public enum SortType {
        ASC, DESC;
    }
}

package com.gdufe.common.util;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @Author: laichengfeng
 * @Description: 有关Map的骚操作
 * @Date: 2018/7/27  16:46
 */
public class MapUtils<K, V extends Number> {

    /**
     * 获取Map中对应最值value的key
     * @param map
     * @return
     */
    private K getKeyForMostValue(Map<K, V> map, MostType type) {
        if(null == map) {
            throw new IllegalArgumentException();
        }
        K key = null;
        BigDecimal maxValue = new BigDecimal(Double.MIN_VALUE);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            final BigDecimal valueDecimal = new BigDecimal(entry.getValue().toString());
            // TODO 此处可优化, 循环内判断type影响性能, 但代码优雅, 放在外部会有重复代码 ?
            switch (type) {
                case MAX:
                    if (maxValue.compareTo(valueDecimal) < 0) {
                        maxValue = valueDecimal;
                        key = entry.getKey();
                    }
                    break;
                case MIN:
                    if (maxValue.compareTo(valueDecimal) < 0) {
                        maxValue = valueDecimal;
                        key = entry.getKey();
                    }
                    break;
            }
        }
        return key;
    }

    public enum MostType{
        MAX, MIN;
    }
}

package com.gdufe.iterator_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/1 23:05
 */
public interface MyIterator {
    void first();

    void next();

    boolean hasNext();

    Object currentItem();
}

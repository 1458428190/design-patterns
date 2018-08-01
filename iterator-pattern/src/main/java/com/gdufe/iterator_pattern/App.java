package com.gdufe.iterator_pattern;

/**
 * @Author: laichengfeng
 * @Description: 迭代器模式
 * @Date: 2018/8/1 23:04
 */
public class App {
    public static void main(String[] args) {
        NewCollection newCollection = new NewCollection();
        MyIterator iterator = newCollection.createMyIterator();
        while(iterator.hasNext()) {
            Object item = iterator.currentItem();
            iterator.next();
            System.out.println(item);
        }
    }
}

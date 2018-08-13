package com.gdufe.visitor_pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: laichengfeng
 * @Description: 对象结构, 购物车类
 * @Date: 2018/8/7 21:57
 */
public class BuyBasket {
    private ArrayList list = new ArrayList();

    public void accept(Visitor visitor) {
        Iterator i = list.iterator();
        while(i.hasNext()) {
            ((Product)(i.next())).accpet(visitor);
        }
    }

    public void addProduct(Product product) {
        list.add(product);
    }

    public void removeProduct(Product product) {
        list.remove(product);
    }
}

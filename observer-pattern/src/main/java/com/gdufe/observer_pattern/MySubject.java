package com.gdufe.observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 抽象目标类
 * @Date: 2018/8/4 16:32
 */
public abstract class MySubject {
    protected List<MyObserver> list = new ArrayList<>();
    public void attach(MyObserver observer) {
        list.add(observer);
    }

    public void detach(MyObserver observer) {
        list.remove(observer);
    }

    public abstract void cry();
}

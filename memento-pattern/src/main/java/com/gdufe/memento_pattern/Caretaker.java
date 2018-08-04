package com.gdufe.memento_pattern;

import java.util.Stack;

/**
 * @Author: laichengfeng
 * @Description: 负责人类
 * @Date: 2018/8/4 11:46
 */
public class Caretaker {

    /**
     * 备忘的最大次数
     */
    private static final int SIZE = 30;

    /**
     * 使用栈保存
     */
    private Stack<Memento> mementoStack = new Stack<>();

    public void saveMemento(Memento memento) {
        if(mementoStack.size() >= SIZE) {
            mementoStack.remove(0);
        }
        mementoStack.push(memento);
    }

    public Memento getMemento() {
        if(mementoStack.isEmpty()){
            return null;
        }
        return mementoStack.pop();
    }
}

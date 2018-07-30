package com.gdufe.composite_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 抽象类
 * @Date: 2018/7/30  20:36
 */
public abstract class LetterComposite {
    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    public void print() {
        printThisBefore();
        for(LetterComposite letter: children) {
            letter.print();
        }
        printThisAfter();
    }

    protected void printThisBefore() {}

    protected void printThisAfter() {}

}

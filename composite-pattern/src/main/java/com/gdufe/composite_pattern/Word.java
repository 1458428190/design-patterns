package com.gdufe.composite_pattern;

import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 单词
 * @Date: 2018/7/30  20:40
 */
public class Word extends LetterComposite{

    public Word(List<Letter> letterList) {
        for(Letter letter: letterList) {
            this.add(letter);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }
}

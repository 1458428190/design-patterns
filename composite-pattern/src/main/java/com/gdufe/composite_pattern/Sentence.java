package com.gdufe.composite_pattern;

import java.util.List;

/**
 * @Author: laichengfeng
 * @Description: 句子
 * @Date: 2018/7/30  20:43
 */
public class Sentence extends LetterComposite{

    public Sentence(List<Word> wordList) {
        for(Word word : wordList) {
            this.add(word);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(".");
    }
}

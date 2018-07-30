package com.gdufe.composite_pattern;

/**
 * @Author: laichengfeng
 * @Description: 字母
 * @Date: 2018/7/30  20:39
 */
public class Letter extends LetterComposite{
    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    public void print() {
        System.out.print(c);
    }
}

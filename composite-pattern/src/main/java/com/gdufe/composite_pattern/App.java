package com.gdufe.composite_pattern;

/**
 * @Author: laichengfeng
 * @Description: 实现了每个单词之间有空格, 每个句子间有个.
 * @Date: 2018/7/30  20:35
 */
public class App {
    public static void main(String[] args) {
        LetterComposite orcMessage = new Messenger().messageFromOrcs();
        orcMessage.print();
        LetterComposite elfMessage = new Messenger().messageFromElves();
        orcMessage.print();
    }
}

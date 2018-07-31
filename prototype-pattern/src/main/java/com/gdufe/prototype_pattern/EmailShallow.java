package com.gdufe.prototype_pattern;


import lombok.Getter;

/**
 * @Author: laichengfeng
 * @Description: 具体原型类，一定要实现Cloneable接口，否则会报CloneNotSupportedException异常
 * @Date: 2018/7/29 21:49
 */
@Getter
public class EmailShallow implements Cloneable{
    private Attachment attachment;

    public EmailShallow() {
        this.attachment = new Attachment();
    }

    /**
     * 重写浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() {
        EmailShallow copyEmailShallow = null;
        try {
            // 当父类没有实现Cloneable时， 会抛异常
            copyEmailShallow = (EmailShallow) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone failed");
        }
        return copyEmailShallow;
    }
}

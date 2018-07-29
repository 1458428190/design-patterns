package com.gdufe.prototype_pattern;

import lombok.Getter;

import java.io.*;

/**
 * @Author: laichengfeng
 * @Description: 具体原型类， 深克隆
 * @Date: 2018/7/29 22:01
 */
@Getter
public class EmailDeep implements Serializable {
    private Attachment attachment = null;

    public EmailDeep() {
        attachment = new Attachment();
    }

    /**
     * 通过将对象写入流中并读取，实现深克隆（其实就是序列化与反序列化的操作）
     * @return
     */
    public EmailDeep deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return (EmailDeep) ois.readObject();
    }

}

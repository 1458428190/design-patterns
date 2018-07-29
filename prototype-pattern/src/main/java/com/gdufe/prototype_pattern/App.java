package com.gdufe.prototype_pattern;

import java.io.IOException;

/**
 * @Author: laichengfeng
 * @Description: 客户端类
 * @Date: 2018/7/29 21:55
 */
public class App {

    /** output
     * emailShallow == copyEmailShallow: false
     * emailShallow.attachment == copyEmailShallow.attachment: true
     * emailDeep == copyEmailDeep: false
     * emailDeep.attachment == copyEmailDeep.attachment: false
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 浅克隆
        EmailShallow emailShallow = new EmailShallow();
        EmailShallow copyEmailShallow = (EmailShallow) emailShallow.clone();
        System.out.println("emailShallow == copyEmailShallow: " + (emailShallow == copyEmailShallow));
        System.out.println("emailShallow.attachment == copyEmailShallow.attachment: "
                + (emailShallow.getAttachment() == copyEmailShallow.getAttachment()));

        // 深克隆
        EmailDeep emailDeep = new EmailDeep();
        EmailDeep copyEmailDeep = emailDeep.deepClone();
        System.out.println("emailDeep == copyEmailDeep: " + (emailDeep == copyEmailDeep));
        System.out.println("emailDeep.attachment == copyEmailDeep.attachment: "
                + (emailDeep.getAttachment() == copyEmailDeep.getAttachment()));

    }
}

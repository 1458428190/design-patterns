package com.gdufe.proxy_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/31 22:43
 */
public class App {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("test1.jpg");
        // 第一次加载图片
        image.display();
        System.out.println("----------------");
        // 不再加载图片
        image.display();
    }
}

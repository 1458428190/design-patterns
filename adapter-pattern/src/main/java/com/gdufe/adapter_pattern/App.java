package com.gdufe.adapter_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/30  19:24
 */
public class App {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}

package com.gdufe.facade_pattern;

import lombok.AllArgsConstructor;

/**
 * @Author: laichengfeng
 * @Description: 电灯类
 * @Date: 2018/7/30 22:47
 */
@AllArgsConstructor
public class Light {
    private String position;

    public void on() {
        System.out.println(this.position + "灯打开！");
    }

    public void off() {
        System.out.println(this.position + "灯关闭！");
    }
}

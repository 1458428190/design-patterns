package com.gdufe.adapter_pattern;

/**
 * @Author: laichengfeng
 * @Description: 适配类
 * @Date: 2018/7/30  19:26
 */
public class Adapter implements Target{

    private Specify specify = new Specify();

    @Override
    public void request() {
        specify.specifiRequest();
    }
}

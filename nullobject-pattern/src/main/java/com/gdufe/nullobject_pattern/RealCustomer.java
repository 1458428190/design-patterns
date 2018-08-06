package com.gdufe.nullobject_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/6 22:05
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}

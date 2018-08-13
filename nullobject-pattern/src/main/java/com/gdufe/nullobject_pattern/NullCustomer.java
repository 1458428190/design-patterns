package com.gdufe.nullobject_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/6 22:05
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}

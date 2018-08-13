package com.gdufe.nullobject_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/8/6 22:06
 */
public class CustomerFactory {
    private static String[] customerNames = {"app", "cat", "dog", "pig"};
    public static AbstractCustomer getCustomer(String name) {
        for(String customerName: customerNames) {
            if(customerName.equals(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}

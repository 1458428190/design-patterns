package com.gdufe.nullobject_pattern;

/**
 * @Author: laichengfeng
 * @Description: 空对象模式
 * @Date: 2018/8/6 22:03
 */
public class App {
    public static void main(String[] args) {
        AbstractCustomer customer = CustomerFactory.getCustomer("app");
        System.out.println(customer.getName());
        customer = CustomerFactory.getCustomer("hhh");
        System.out.println(customer.getName());

    }
}

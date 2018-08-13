package com.gdufe.visitor_pattern;

/**
 * @Author: laichengfeng
 * @Description: 访问者模式
 * @Date: 2018/8/7 21:40
 */
public class App {
    public static void main(String[] args) {
        Product apple1 = new Apple();
        Product apple2 = new Apple();
        Product book = new Book();
        BuyBasket buyBasket = new BuyBasket();
        Visitor customer = new Customer();
        customer.setName("小三");
        Visitor saler = new Saler();
        saler.setName("老板");
        buyBasket.addProduct(apple1);
        buyBasket.addProduct(apple2);
        buyBasket.addProduct(book);
        buyBasket.accept(customer);
        System.out.println("---------------------------");
        buyBasket.accept(saler);
    }
}

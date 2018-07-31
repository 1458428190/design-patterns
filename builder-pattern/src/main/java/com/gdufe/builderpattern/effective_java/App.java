package com.gdufe.builderpattern.effective_java;

/**
 * @Author: laichengfeng
 * @Description: 主程序类， 测试构建器
 * @Date: 2018/7/29 21:22
 */
public class App {
    public static void main(String[] args) {
        User user = new User.Builder(1,"laichengfeng")
                .setAddr("Guang Zhou")
                .setEmail("laichengfeng@gmail.com")
                .setCountry("china")
                .build();
        System.out.println(user);
    }
}

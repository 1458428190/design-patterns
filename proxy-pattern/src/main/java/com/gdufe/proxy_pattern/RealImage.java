package com.gdufe.proxy_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/31 22:43
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFileName(fileName);
    }

    private void loadFileName(String fileName) {
        System.out.println("Loading :" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying："+ fileName);
    }
}

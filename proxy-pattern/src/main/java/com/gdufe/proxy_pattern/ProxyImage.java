package com.gdufe.proxy_pattern;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/31 22:44
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

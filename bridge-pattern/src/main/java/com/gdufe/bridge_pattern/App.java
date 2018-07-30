package com.gdufe.bridge_pattern;

/**
 * @Author: laichengfeng
 * @Description: 路和交通工具2个维度可以同时变化
 * @Date: 2018/7/30  19:42
 */
public class App {
    public static void main(String[] args) {
        Road road = new UnpavedRoad(new Car());
        road.driveOnRoad();
    }
}

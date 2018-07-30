package com.gdufe.bridge_pattern;

/**
 * @Author: laichengfeng
 * @Description: 抽象 路类
 * @Date: 2018/7/30  19:47
 */
public abstract class Road {
    protected Vehicle vehicle;

    public Road(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract void driveOnRoad();
}

package com.gdufe.bridge_pattern;

/**
 * @Author: laichengfeng
 * @Description: 具体的路
 * @Date: 2018/7/30  19:49
 */
public class CementRoad extends Road{
    public CementRoad(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        super.vehicle.drive();
        System.out.println(" on the cement road");
    }
}

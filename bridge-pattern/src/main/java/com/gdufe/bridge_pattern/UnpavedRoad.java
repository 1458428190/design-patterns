package com.gdufe.bridge_pattern;

/**
 * @Author: laichengfeng
 * @Description: 具体的路
 * @Date: 2018/7/30  19:47
 */
public class UnpavedRoad extends Road {

    public UnpavedRoad(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void driveOnRoad() {
        super.vehicle.drive();
        System.out.println(" on the uppave road");
    }
}

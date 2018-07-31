package com.gdufe.facade_pattern;

/**
 * @Author: laichengfeng
 * @Description: 外观类
 * @Date: 2018/7/30 22:54
 */
public class GeneralSwitchFacade {

    private Light[] lights = new Light[4];

    private Fan fan;

    private AirConditioner airConditioner;

    private Tevevision tevevision;

    public GeneralSwitchFacade() {
        lights[0] = new Light("left");
        lights[1] = new Light("right");
        lights[2] = new Light("up");
        lights[3] = new Light("down");
        fan = new Fan();
        airConditioner = new AirConditioner();
        tevevision = new Tevevision();
    }

    public void on() {
        lights[0].on();
        lights[1].on();
        lights[2].on();
        lights[3].on();
        fan.on();
        airConditioner.on();
        tevevision.on();
    }

    public void off() {
        lights[0].off();
        lights[1].off();
        lights[2].off();
        lights[3].off();
        fan.off();
        airConditioner.off();
        tevevision.off();
    }
}

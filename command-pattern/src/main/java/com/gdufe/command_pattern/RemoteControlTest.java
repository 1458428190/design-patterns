package com.gdufe.command_pattern;


/**
 *  created by : GuanQihua
 *  description : 简单测试
 *
 *  命令模式:将"请求"封装成对象,以便使用不同请求,
 *  队列或者日志来参数化其他对象。命令模式也支持
 *  可撤销的操作。
 */
public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}

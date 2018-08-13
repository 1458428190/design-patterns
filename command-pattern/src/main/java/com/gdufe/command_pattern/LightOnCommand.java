package com.gdufe.command_pattern;


/**
 *  created by : GuanQihua
 *  description : 打开电灯命令
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.On();
    }
}

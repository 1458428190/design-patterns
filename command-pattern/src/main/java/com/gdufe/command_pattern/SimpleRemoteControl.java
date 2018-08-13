package com.gdufe.command_pattern;


/**
 *  created by : GuanQihua
 *  description : 简单命令对象
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){

    }

    /**
     *  设置装置
     */
    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}

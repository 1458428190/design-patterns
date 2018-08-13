package com.gdufe.command_pattern;


/**
 *  created by : GuanQihua
 *  description :  电灯
 */
public class Light {

    private Integer status = 0 ;

    public void On(){
        System.out.println("Light is On!");
        status = 1;
    }

    public void Off(){
        System.out.println("Light is Off!");
        status = 0;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ligth{" +
                "status=" + status +
                '}';
    }
}

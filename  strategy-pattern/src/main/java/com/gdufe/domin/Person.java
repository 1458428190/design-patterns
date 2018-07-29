package com.gdufe.domin;

import com.gdufe.beahavior.WalkBehavior;
/**
 * @Author: GuanQihua
 * @Description: 抽象Person类,组合了WalkBehavior接口
 * @Date: 2018/7/29 12:52
 */
public abstract class Person {

    WalkBehavior walkBehavior;

    public Person(){
    }

    public abstract void display();

    public void performWalk(){
        walkBehavior.walk();
    }

    public void setWalkBehavior(WalkBehavior wb){
        this.walkBehavior = wb;
    }
}

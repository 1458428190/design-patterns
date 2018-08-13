package com.gdufe.domin;

import com.gdufe.behavior.PromenadeBehavior;
import com.gdufe.behavior.RunBehavior;

/**
 * @Author: GuanQihua
 * @Description: Runner类，继承了抽象Person类
 * @Date: 2018/7/29 12:52
 */
public class Runner extends Person{

    /**
     * 通过构造器给Runner指定他的走路方式
     */
    public Runner(){
        walkBehavior = new RunBehavior();
    }
    @Override
    public void display() {
        System.out.println("I am runner!");
    }
//
//    public static void main(String [] args){
//        Runner runner = new Runner();
//        //跑步选手开始跑步
//        runner.performWalk();
//        //跑步选手突然想散步，通过setWalkBehavior改变他的走路方式;
//        runner.setWalkBehavior(new PromenadeBehavior());
//        runner.performWalk();
//    }
}

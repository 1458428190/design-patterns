package com.gdufe.behavior;

/**
 * @Author: GuanQihua
 * @Description: RunBeahavior实现了WalkBehavior接口  (RunBehavior:跑步)
 * @Date: 2018/7/29 12:52
 */
public class RunBehavior implements WalkBehavior{
    public void walk(){
        System.out.println("I am running");
    }
}

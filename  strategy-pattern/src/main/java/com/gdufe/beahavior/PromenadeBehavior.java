package com.gdufe.beahavior;

/**
 * @Author: GuanQihua
 * @Description: PromenadeBehavior实现了WalkBehavior接口 (PromenadeBehavior：闲逛)
 * @Date: 2018/7/29 12:52
 */
public class PromenadeBehavior implements WalkBehavior{
    @Override
    public void walk() {
        System.out.println("I am promenading!");
    }
}

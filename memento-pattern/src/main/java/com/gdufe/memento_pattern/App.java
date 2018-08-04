package com.gdufe.memento_pattern;

/**
 * @Author: laichengfeng
 * @Description: 备忘录模式
 * @Date: 2018/8/4 11:40
 */
public class App {
    public static void main(String[] args) {
        UserInfoVO userInfoVO = new UserInfoVO();
        Caretaker caretaker = new Caretaker();
        userInfoVO.setAccount("145842819");
        userInfoVO.setPassword("111111");
        userInfoVO.setTelNo("135454");
        System.out.println(userInfoVO);
        caretaker.saveMemento(userInfoVO.saveMemento());
        userInfoVO.setAccount("111111");
        userInfoVO.setPassword("22222222222");
        userInfoVO.setTelNo("2222222");
        System.out.println(userInfoVO);
        caretaker.saveMemento(userInfoVO.saveMemento());
        userInfoVO.setAccount("333333333");
        userInfoVO.setPassword("33333");
        userInfoVO.setTelNo("33333");
        caretaker.saveMemento(userInfoVO.saveMemento());
        userInfoVO.restoreMemento(caretaker.getMemento());
        System.out.println(userInfoVO);
        userInfoVO.restoreMemento(caretaker.getMemento());
        System.out.println(userInfoVO);
        userInfoVO.restoreMemento(caretaker.getMemento());
        System.out.println(userInfoVO);
        userInfoVO.restoreMemento(caretaker.getMemento());
        System.out.println(userInfoVO);

    }
}

package com.gdufe;
/**
 * @Author: GuanQihua
 * @Description: 静态代码块，线程安全
 * @Date: 2018/7/29 11:03
 */
public class StaticCodeBlockSingleton {
    private static Object MyObject;

    static{
        MyObject = new Object();
    }

    public static Object getMyObject(){
        return MyObject;
    }
}

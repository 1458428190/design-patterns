package com.gdufe;

public class StaticCodeBlockSingleton {
    private static Object MyObject;

    static{
        MyObject = new Object();
    }

    public static Object getMyObject(){
        return MyObject;
    }
}

package com.wh.Singleton;

/**
 * reference: https://www.cnblogs.com/cielosun/p/6582333.html
 * 1.没有考虑到线程安全，可能存在多个访问者同时访问，并同时构造了多个对象的问题
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }
}

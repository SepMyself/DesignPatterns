package com.wh.Singleton;

/**
 * 2.然而并发其实是一种特殊情况，大多时候这个锁占用的额外资源都浪费了，这种打补丁方式写出来的结构效率很低
 */
public class ConcurrentLazySingleton {
    private static ConcurrentLazySingleton instance = null;

    private ConcurrentLazySingleton(){}

    public static synchronized ConcurrentLazySingleton getInstance(){
        if(instance == null){
            instance = new ConcurrentLazySingleton();
        }

        return instance;
    }
}

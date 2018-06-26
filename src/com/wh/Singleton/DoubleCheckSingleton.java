package com.wh.Singleton;

/**
 * 双重校验锁法是线程安全的，并且，这种方法实现了lazyloading
 * 通过反射破坏单例
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}

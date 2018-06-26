package com.wh.Singleton;

/**
 * 4.
 * 静态内部类不会在单例加载时就加载，而是在调用getInstance()方法时才进行加载，达到了类似懒汉模式的效果，
 * 而这种方法又是线程安全的
 */
public class StaticSingleton {
    private static class SingletonHolder {
        private static StaticSingleton instance = new StaticSingleton();
    }

    private StaticSingleton(){}

    public static StaticSingleton getInstance(){
        return SingletonHolder.instance;
    }
}

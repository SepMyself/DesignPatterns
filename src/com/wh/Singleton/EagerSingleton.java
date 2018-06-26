package com.wh.Singleton;

/**
 * 3.
 * 直接在运行这个类的时候进行一次loading，之后直接访问
 * 显然，这种方法没有起到lazy loading的效果，考虑到前面提到的和静态类的对比，这种方法只比静态类多了一个内存常驻而已
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }
}

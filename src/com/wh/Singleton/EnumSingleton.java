package com.wh.Singleton;

/**
 * 5.NBility
 */
public class EnumSingleton {
    private EnumSingleton(){}

    public static EnumSingleton getInstance(){
        return Singleton.INSANCE.getIntance();
    }

    private static enum Singleton{
        INSANCE;
        private EnumSingleton singleton;

        //JVM会保证此方法绝对只调用一次
        private Singleton(){
            singleton = new EnumSingleton();
        }

        public EnumSingleton getIntance(){
            return singleton;
        }
    }
}

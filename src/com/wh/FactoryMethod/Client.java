package com.wh.FactoryMethod;

import com.wh.AbstractFactory.AmdFactory;
import com.wh.AbstractFactory.IAbstractFactory;
import com.wh.AbstractFactory.IntelFactory;
import com.wh.SimpleFactory.ICpu;

/**
 * 工厂方法模式针对的是一个产品等级结构
 */
public class Client {
    public static void main(String[] args){
        //IAbstractFactory factory = new IntelFactory();
        IAbstractFactory factory = new AmdFactory();
        ICpu cpu = factory.createCpu();
        cpu.calculate();
    }
}

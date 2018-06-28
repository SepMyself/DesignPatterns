package com.wh.AbstractFactory;

/**
 * 抽象工厂模式则需要面对多个产品等级结构。
 */
public class Client {
    public static void main(String[] args){
        ComputerEngineer cf = new ComputerEngineer();
        IAbstractFactory af = new IntelFactory();
        cf.makeComputer(af);
    }
}

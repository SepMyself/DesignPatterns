package com.wh.AbstractFactory;

public class Client {
    public static void main(String[] args){
        ComputerEngineer cf = new ComputerEngineer();
        IAbstractFactory af = new IntelFactory();
        cf.makeComputer(af);
    }
}

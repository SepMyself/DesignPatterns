package com.wh.SimpleFactory;

public class Client {
    public static void main(String[] args){
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1, 2);
    }
}

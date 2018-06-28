package com.wh.SimpleFactory;

/**
 * Reference: http://www.cnblogs.com/java-my-life/archive/2012/03/28/2418836.html
 */
public class Client {
    public static void main(String[] args){
        ComputerEngineer cf = new ComputerEngineer();
        cf.makeComputer(1, 2);
    }
}

package com.wh.SimpleFactory;

public class AmdCpu implements ICpu {
    private int pins = 0;

    public AmdCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数: " + pins);
    }
}
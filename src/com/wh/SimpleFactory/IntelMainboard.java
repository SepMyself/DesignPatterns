package com.wh.SimpleFactory;

public class IntelMainboard implements IMainboard {
    private int cpuHoles = 0;

    public IntelMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("Intel 主板的CPU插槽孔数是: " + cpuHoles);
    }
}

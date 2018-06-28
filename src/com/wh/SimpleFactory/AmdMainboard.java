package com.wh.SimpleFactory;

public class AmdMainboard implements IMainboard {
    private int cpuHoles = 0;

    public AmdMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("AMD 主板的CPU插槽孔数是: " + cpuHoles);
    }
}

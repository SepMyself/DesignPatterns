package com.wh.SimpleFactory;

public class ComputerEngineer {
    private ICpu cpu = null;
    private IMainboard mainboard = null;

    public void makeComputer(int cpuType, int mainboard){
        prepareHardware(cpuType, mainboard);
    }

    private void prepareHardware(int cpuType, int mainboard){
        this.cpu = CpuFactory.createCpu(cpuType);
        this.mainboard = MainboardFactory.createMainboard(mainboard);

        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}

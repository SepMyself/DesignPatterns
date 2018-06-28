package com.wh.AbstractFactory;

import com.wh.SimpleFactory.ICpu;
import com.wh.SimpleFactory.IMainboard;

public class ComputerEngineer {
    private ICpu cpu = null;
    private IMainboard mainboard = null;

    public void makeComputer(IAbstractFactory af){
        prepareHardwares(af);
    }

    private void prepareHardwares(IAbstractFactory af){
        this.cpu = af.createCpu();
        this.mainboard = af.createMainboard();

        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}

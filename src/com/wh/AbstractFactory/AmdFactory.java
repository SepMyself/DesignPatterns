package com.wh.AbstractFactory;

import com.wh.SimpleFactory.AmdCpu;
import com.wh.SimpleFactory.AmdMainboard;
import com.wh.SimpleFactory.ICpu;
import com.wh.SimpleFactory.IMainboard;

public class AmdFactory implements IAbstractFactory {
    @Override
    public ICpu createCpu(){
        return new AmdCpu(938);
    }

    @Override
    public IMainboard createMainboard(){
        return new AmdMainboard(938);
    }
}

package com.wh.AbstractFactory;

import com.wh.SimpleFactory.*;

public class IntelFactory implements IAbstractFactory {
    @Override
    public ICpu createCpu(){
        return new IntelCpu(755);
    }

    @Override
    public IMainboard createMainboard(){
        return new IntelMainboard(755);
    }
}

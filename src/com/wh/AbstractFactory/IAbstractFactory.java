package com.wh.AbstractFactory;

import com.wh.SimpleFactory.ICpu;
import com.wh.SimpleFactory.IMainboard;

public interface IAbstractFactory {
    public ICpu createCpu();
    public IMainboard createMainboard();
}

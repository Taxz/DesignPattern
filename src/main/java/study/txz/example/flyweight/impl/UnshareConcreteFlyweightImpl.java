package study.txz.example.flyweight.impl;

import study.txz.example.flyweight.Flyweight;

/**
 * Created by Taxz on 2019/2/24/024.
 * GitHub:https://github.com/Taxz
 *
 * 不需要共享的享元对象实现
 */
public class UnshareConcreteFlyweightImpl implements Flyweight {

    private String priState;

    public UnshareConcreteFlyweightImpl(String priState) {
        this.priState = priState;
    }

    @Override
    public boolean match(String enty, String perssion) {
        return false;
    }
}

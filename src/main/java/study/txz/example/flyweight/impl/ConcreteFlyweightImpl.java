package study.txz.example.flyweight.impl;

import study.txz.example.flyweight.Flyweight;

/**
 * Created by Taxz on 2019/2/24/024.
 * GitHub:https://github.com/Taxz
 *
 * 共享享元的实现，封装内部状态
 */
public class ConcreteFlyweightImpl implements Flyweight {

    //内部状态
    private String securityEntry;

    private String permit;


    public ConcreteFlyweightImpl(String innerState) {
        this.securityEntry = innerState.split(",")[0];
        this.permit = innerState.split(",")[1];
    }

    @Override
    public boolean match(String enty, String perssion) {
        if (this.permit.equals(perssion) && this.securityEntry.equals(enty)) {
            return true;
        }
        return false;
    }
}

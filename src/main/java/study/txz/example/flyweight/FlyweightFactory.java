package study.txz.example.flyweight;

import study.txz.example.flyweight.impl.ConcreteFlyweightImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Taxz on 2019/2/24/024.
 * GitHub:https://github.com/Taxz
 *
 * 享元工厂
 */
public class FlyweightFactory {

    private static FlyweightFactory factory = new FlyweightFactory();

    //缓存相同key的对象，节省内存 保证同一个对象只创建一次
    private Map<String, Flyweight> map = new HashMap<>();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getFactory() {
        return factory;
    }

    public Flyweight getFlyWeight(String key) {

        Flyweight fly = map.get(key);

        if (fly == null) {
            fly = new ConcreteFlyweightImpl(key);
            map.put(key, fly);
        }

        return fly;
    }
}

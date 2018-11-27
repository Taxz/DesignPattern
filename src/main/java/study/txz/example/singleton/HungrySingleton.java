package study.txz.example.singleton;

/**
 * Created by Taxz on 2018/11/27/027.
 * GitHub:https://github.com/Taxz
 */
public class HungrySingleton {

    private static HungrySingleton singleton;

    private HungrySingleton() {
    }

    /**
     * warn: 线程不安全，在多线程的情况下，出现实例化多次，
     * solution：双重检验,添加synchronized，类加载初始化实例
     *
     * @return
     */
    public static HungrySingleton getSingleton() {
        if (singleton == null) {
            singleton = new HungrySingleton();
        }
        return singleton;
    }


    /**
     * 1. 类加载初始化实例
     * private static HungrySingleton singleton=new HungrySingleton();
     */

    //  2. synchronized  warn 只能允许一个线程操作，其他线程只能等待，阻塞时间过长
    public static synchronized HungrySingleton getSingletonBySyn() {

        if (singleton == null) {
            singleton = new HungrySingleton();
        }
        return singleton;
    }

    // 3.双重检验  如果只使用第一个if判断的话，当两个线程都得到是null,然后是先后顺序执行锁代码块，会出现初始化多次，
    // 所以需要第二个if 进行判断
    public static HungrySingleton getSingletonByCheckout() {

        if (singleton == null) {
            synchronized (HungrySingleton.class) {
                if (singleton == null) {
                    singleton = new HungrySingleton();
                }
            }
        }
        return singleton;
    }

    // 3. 静态内部类
    private static class SingletonHolder {
        private static final HungrySingleton INSTANCE = new HungrySingleton();
    }

    public static HungrySingleton getSingletonBystaticclass() {
        return SingletonHolder.INSTANCE;
    }

    // 4. 枚举实现
    enum SingleEnum{
        INSTANCE;

        SingleEnum() {
            //do something
        }

    }

    public static SingleEnum getSingletonByEnum() {
        return SingleEnum.INSTANCE;
    }


}

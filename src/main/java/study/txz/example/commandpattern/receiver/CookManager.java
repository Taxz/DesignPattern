package study.txz.example.commandpattern.receiver;

/**
 * Created by Taxz on 2019/2/14.
 */
public class CookManager {

    private static boolean runFlag = false;

    public static void start() {
        if (!runFlag) {
            runFlag = true;
            HotCooker hotCooker1 = new HotCooker("张三");
            HotCooker hotCooker2 = new HotCooker("李四");
            HotCooker hotCooker3 = new HotCooker("王五");
            //启动他们的线程
            Thread t1 = new Thread(hotCooker1);
            t1.start();
            Thread t2 = new Thread(hotCooker2);
            t2.start();
            Thread t3 = new Thread(hotCooker3);
            t3.start();
        }
    }
}

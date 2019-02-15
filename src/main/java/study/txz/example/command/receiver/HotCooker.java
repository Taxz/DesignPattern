package study.txz.example.command.receiver;

import study.txz.example.command.command.CommandQueue;
import study.txz.example.command.command.CookCommand;

/**
 * Created by Taxz on 2019/2/14.
 *
 * 接受者 命令的最终执行者
 */
public class HotCooker implements Cooker, Runnable {

    //厨师姓名
    private String name;

    public HotCooker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            CookCommand command = CommandQueue.getOne();
            if (command != null) {
                command.setCooker(this);
                command.execute();
            }
        }
    }

    @Override
    public void cook(int tableNum, String cooke) {
        System.out.println( name + "厨师：" +",正在做" + tableNum + "号餐的"+cooke);
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
        }
        System.out.println( name + "厨师：" +",完成" + tableNum + "号餐的"+cooke);
    }
}

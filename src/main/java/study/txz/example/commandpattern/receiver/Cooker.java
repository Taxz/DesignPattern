package study.txz.example.commandpattern.receiver;

/**
 * Created by Taxz on 2019/2/14.
 *
 * 厨师接口
 */
public interface Cooker {

    /**
     * 做菜方法
     *
     * @param tableNum 桌号
     * @param name 菜名
     */
    void cook(int tableNum,String name);
}

package study.txz.example.command.invoker;

import study.txz.example.command.command.CookCommand;
import study.txz.example.command.command.MenuCommand;

/**
 * Created by Taxz on 2019/2/14.
 */
public class Waiter {

    private MenuCommand menuCommand = new MenuCommand();

    /**
     * 开始点餐，构造菜单对象
     * @param command
     */
    public void order(CookCommand command) {
        menuCommand.addCommand(command);
    }

    /**
     * 点餐完毕，传到队列中，给后厨
     */
    public void over() {
        menuCommand.execute();
    }
}

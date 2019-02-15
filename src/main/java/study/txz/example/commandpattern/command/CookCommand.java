package study.txz.example.commandpattern.command;

import study.txz.example.commandpattern.receiver.Cooker;

/**
 * Created by Taxz on 2019/2/14.
 *
 * 做菜命令接口
 */
public interface CookCommand {

    //执行命令接口
    void execute();

    //设置命令的接受者
    void setCooker(Cooker cooker);

    //获取桌号
    int getTableNum();
}

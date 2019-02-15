package study.txz.example.commandpattern.command;

import study.txz.example.commandpattern.receiver.Cooker;

/**
 * Created by Taxz on 2019/2/14.
 *
 * 实现类：命令对象，绿豆排骨汤
 */
public class DuckCommand implements CookCommand {

    private Cooker cooker;

    private int tableNum;

    public DuckCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        System.out.println("sss");
        this.cooker.cook(tableNum,"北京烤鸭");
    }

    public Cooker getCooker() {
        return cooker;
    }

    @Override
    public void setCooker(Cooker cooker) {
        this.cooker = cooker;
    }

    @Override
    public int getTableNum() {
        return 0;
    }
}

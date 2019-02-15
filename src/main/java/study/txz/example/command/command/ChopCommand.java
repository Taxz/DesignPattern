package study.txz.example.command.command;

import study.txz.example.command.receiver.Cooker;

/**
 * Created by Taxz on 2019/2/14.
 *
 * 实现类：命令对象，绿豆排骨汤
 */
public class ChopCommand implements CookCommand {

    private Cooker cooker;

    private int tableNum;

    public ChopCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        this.cooker.cook(tableNum,"绿豆排骨汤");
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

package study.txz.example.commandpattern.command;

import study.txz.example.commandpattern.receiver.Cooker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taxz on 2019/2/14.
 *
 * 菜单对象 宏命令对象
 */
public class MenuCommand implements CookCommand{

    private List<CookCommand> cmds = new ArrayList<>();

    public void addCommand(CookCommand command) {
        cmds.add(command);
    }

    public List<CookCommand> getCmds() {
        return cmds;
    }

    /**
     * 菜单执行完之后，
     */
    @Override
    public void execute() {
        CommandQueue.addMenu(this);
    }

    @Override
    public void setCooker(Cooker cooker) {

    }

    @Override
    public int getTableNum() {
        return 0;
    }
}

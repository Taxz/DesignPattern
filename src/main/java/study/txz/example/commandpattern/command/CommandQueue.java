package study.txz.example.commandpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taxz on 2019/2/14.
 *
 * 命令队列类
 */
public class CommandQueue {

    //存放命令
    private static List<CookCommand> cmds = new ArrayList<>();

    public synchronized static void addMenu(MenuCommand menu) {
        for (CookCommand cmd : menu.getCmds()) {
            cmds.add(cmd);
        }
    }

    public synchronized static CookCommand getOne() {
        if (cmds.size() > 0) {
            CookCommand command = cmds.get(0);
            cmds.remove(command);
            return command;
        }else {

            return null;
        }
    }


}

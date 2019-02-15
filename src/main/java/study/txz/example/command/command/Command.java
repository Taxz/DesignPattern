package study.txz.example.command.command;

/**
 * Created by Taxz on 2019/2/13.
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 命令撤销
     */
    void undo();
}

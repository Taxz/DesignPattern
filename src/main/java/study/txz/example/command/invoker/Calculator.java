package study.txz.example.command.invoker;

import study.txz.example.command.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taxz on 2019/2/13.
 *
 * 请求者
 */
public class Calculator {

    //撤销命令集合
    private List<Command> undo = new ArrayList<>();

    //恢复命令集合
    private List<Command> redo = new ArrayList<>();

    /**
     * 加法 命令
     */
    private Command add;

    /**
     * 减法 命令
     */
    private Command substract;

    public void setAdd(Command add) {
        this.add = add;
    }

    public void setSubstract(Command substract) {
        this.substract = substract;
    }

    public void add() {
        this.add.execute();
        this.undo.add(this.add);
    }

    public void substract() {
        this.substract.execute();
        this.undo.add(this.substract);
    }

    /**
     * 撤销操作
     */
    public void undoPressed() {
        if (undo.size()>0) {
            Command command = undo.get(undo.size() - 1);
            command.undo();
            redo.add(command);
            undo.remove(command);
        }else
            System.out.println("没有可以撤销的操作");
    }

    public void doPressed() {
        if (redo.size()>0) {
            Command command = redo.get(redo.size() - 1);
            command.execute();
            undo.add(command);
            redo.remove(command);
        }else
            System.out.println("没有可以恢复的操作");
    }

}

package study.txz.example.commandpattern.command;

import study.txz.example.commandpattern.receiver.OperationImpl;
import study.txz.example.commandpattern.receiver.OperationInterface;

/**
 * Created by Taxz on 2019/2/13.
 */
public class AddCommandImpl implements Command {

    //计算器
    private OperationInterface operation;

    //计算值
    private int nums;

    public AddCommandImpl(OperationImpl operation, int nums) {
        this.operation = operation;
        this.nums = nums;
    }

    @Override
    public void execute() {
        this.operation.add(nums);
    }

    //加操作对应的撤销 为减
    @Override
    public void undo() {
        this.operation.substract(nums);
    }
}

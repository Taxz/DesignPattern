package study.txz.example.command.command;

import study.txz.example.command.receiver.OperationImpl;

/**
 * Created by Taxz on 2019/2/13.
 */
public class SubStractCommandImpl implements  Command {

    private int nums;
    private OperationImpl operation;

    public SubStractCommandImpl(int nums, OperationImpl operation) {
        this.nums = nums;
        this.operation = operation;
    }

    public SubStractCommandImpl(OperationImpl operation ,int nums) {
        this.nums = nums;
        this.operation = operation;
    }
    @Override
    public void execute() {
        this.operation.substract(nums);
    }

    @Override
    public void undo() {
        this.operation.add(nums);
    }
}

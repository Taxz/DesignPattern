package study.txz.example.ommandpattern.receiver;

/**
 * Created by Taxz on 2019/2/13.
 *
 * 具体的计算器实现
 */
public class OperationImpl implements OperationInterface {

    private int result = 0;
    @Override
    public int getResult() {
        return this.result;
    }

    @Override
    public void setResult(int num) {
        this.result = num;
    }

    @Override
    public void add(int num) {
        this.result += num;
    }

    @Override
    public void substract(int num) {
        this.result -= num;
    }
}

package study.txz.example.commandpattern.receiver;

/**
 * Created by Taxz on 2019/2/13.
 *
 * 定义一个计算器，用于实现加、减，作为接受者，命令最终的执行者
 */
public interface OperationInterface {

    /**
     * 获取计算结果
     *
     * @return
     */
    int getResult();

    /**
     * 设置初始值
     */
    void setResult(int num);

    /**
     * 加运算
     *
     * @param num
     */
    void add(int num);

    /**
     * 减运算
     *
     * @Param num
     */
    void substract(int num);

}

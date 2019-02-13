package study.txz.example.ommandpattern;

import study.txz.example.ommandpattern.command.AddCommandImpl;
import study.txz.example.ommandpattern.command.SubStractCommandImpl;
import study.txz.example.ommandpattern.invoker.Calculator;
import study.txz.example.ommandpattern.receiver.OperationImpl;

/**
 * Created by Taxz on 2019/2/13.
 *
 * 客户端
 */
public class Client {

    public static void main(String[] args) {

        OperationImpl operation = new OperationImpl();
        AddCommandImpl addCommand = new AddCommandImpl(operation, 5);
        SubStractCommandImpl stractCommand = new SubStractCommandImpl(operation, 3);
        Calculator calculator = new Calculator();
        calculator.setAdd(addCommand);
        calculator.setSubstract(stractCommand);
        calculator.add();
        System.out.println("第一次运行结果：" + operation.getResult());
        calculator.substract();
        System.out.println("第二次运行结果：" + operation.getResult());
        calculator.undoPressed();
        System.out.println("第一次取消结果:" + operation.getResult());
        calculator.undoPressed();
        System.out.println("第二次取消结果：" + operation.getResult());

        calculator.doPressed();
        System.out.println("第一次恢复结果：" + operation.getResult());
        calculator.doPressed();
        System.out.println("第二次恢复结果：" + operation.getResult());
    }
}

package study.txz.example.command;

import study.txz.example.command.command.*;
import study.txz.example.command.invoker.Calculator;
import study.txz.example.command.invoker.Waiter;
import study.txz.example.command.receiver.CookManager;
import study.txz.example.command.receiver.OperationImpl;

/**
 * Created by Taxz on 2019/2/13.
 *
 * 客户端
 */
public class Client {

    public static void main1(String[] args) {

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

    public static void main(String[] args) {
        CookManager.start();

        Waiter waiter = new Waiter();
        for (int i=0;i<5;i++) {
            CookCommand command1 = new ChopCommand(i);
            CookCommand command2 = new DuckCommand(i);

            waiter.order(command1);
            waiter.order(command2);
        }
        waiter.over();
    }
}

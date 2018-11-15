package study.txz.example.chainofresponsibility;

/**
 * Created by Taxz on 2018/11/15.
 *
 * 示例：责任链模式
 * RequestType 表示请求类型，Peron 的position 对应处理不同的请求类型
 */
public class demo {
    public static void main(String[] args) {
        Person jitty = new Person("1", "Jitty",null);
        Person bety = new Person("2", "Bety",jitty);
        Person cell = new Person("3", "cell",bety);
        System.out.println(cell.doHandle(RequestType.TYPE_1));
        System.out.println(cell.doHandle(RequestType.TYPE_2));
        System.out.println(cell.doHandle(RequestType.TYPE_3));
    }
}

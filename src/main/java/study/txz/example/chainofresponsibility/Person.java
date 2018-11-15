package study.txz.example.chainofresponsibility;

/**
 * Created by Taxz on 2018/11/15.
 *
 * class
 *    处理操作的实现类
 * function
 *      doHandle 根据position 处理请求类型，
 *      不能处理的传递到handler引用处理
 *
 */
public class Person extends Handler {
    private String position;
    private String name;

    public Person(String position, String name,Handler handler) {
        this.position = position;
        this.name = name;
        this.successor = handler;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String doHandle(String type) {
        if (this.position.equals(type)) {
            return name+" doHandle:" + position;
        } else
            System.out.print(name+"->");
            return getSuccessor().doHandle(type);
    }
}

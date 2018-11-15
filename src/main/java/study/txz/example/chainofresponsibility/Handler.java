package study.txz.example.chainofresponsibility;

/**
 * Created by Taxz on 2018/11/15.
 *
 * 抽象处理类 定义处理方法 doHandle
 */
public abstract class Handler {
    protected Handler successor = null;

    public abstract String doHandle(String type);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}

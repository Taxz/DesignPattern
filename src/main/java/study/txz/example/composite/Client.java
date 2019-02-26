package study.txz.example.composite;

/**
 * Created by Taxz on 2019/2/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Client {

    public static void main(String[] args) {
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("女装");

        Component l1 = new Composite("裙子");
        Component l2 = new Composite("套装");
        Component f1 = new Composite("夹克");
        Component f2 = new Composite("短袖");

        c1.addChild(f1);
        c1.addChild(f2);
        c2.addChild(l1);
        c2.addChild(l2);

        root.addChild(c1);
        root.addChild(c2);

        root.printStruct(" ");
    }
}

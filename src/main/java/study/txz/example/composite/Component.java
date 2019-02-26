package study.txz.example.composite;

/**
 * Created by Taxz on 2019/2/25/025.
 * GitHub:https://github.com/Taxz
 * <p>
 * 抽象的控件类
 */
public abstract class Component {

    //输出组件自身的名称
    abstract void printStruct(String key);

    public void addChild(Component child) {
        throw new UnsupportedOperationException("该对象没有此功能");
    }

    public void removeChild(String child) {
        throw new UnsupportedOperationException("该对象没有此功能");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("该对象没有此功能");
    }
}

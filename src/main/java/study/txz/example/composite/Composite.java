package study.txz.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Taxz on 2019/2/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Composite extends Component {

    //用来存储组合对象中包含的子组件对象
    private List<Component> list = null;
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(child);
    }

    @Override
    public void removeChild(String child) {
        if (list.contains(child)) {
            list.remove(child);
        }
    }

    @Override
    public Component getChild(int index) {
        if (index > 0 && index < list.size()) {
            return list.get(index);
        }
        return null;
    }

    @Override
    void printStruct(String key) {
        System.out.println(key + "" + this.name);
        if (this.list != null) {
            key +="  ";
            for (Component c : list) {
                c.printStruct(key);
            }
        }
    }
}

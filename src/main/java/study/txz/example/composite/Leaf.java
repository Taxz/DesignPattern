package study.txz.example.composite;

/**
 * Created by Taxz on 2019/2/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Leaf extends Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void printStruct(String k) {
        System.out.println(k+"-"+this.name);
    }
}

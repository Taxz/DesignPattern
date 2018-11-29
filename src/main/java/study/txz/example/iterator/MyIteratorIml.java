package study.txz.example.iterator;


/**
 * Created by Taxz on 2018/11/29/029.
 * GitHub:https://github.com/Taxz
 */
public class MyIteratorIml implements IMyIterator {

    private Integer [] iteams;

    public MyIteratorIml() {
        this.iteams = new Integer[10];
        for (int i=0;i<iteams.length;i++) {
            iteams[i] = i;
        }

    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(iteams);
    }
}

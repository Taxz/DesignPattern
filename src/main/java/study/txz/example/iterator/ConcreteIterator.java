package study.txz.example.iterator;

/**
 * Created by Taxz on 2018/11/29/029.
 * GitHub:https://github.com/Taxz
 *
 * 迭代器具体实现类
 */
public class ConcreteIterator<Iteam> implements Iterator {

    private Iteam[] iteams;
    private int postion = 0;

    public ConcreteIterator(Iteam[] iteams) {
        this.iteams = iteams;
    }

    @Override
    public Object next() {

        return iteams[postion++];
    }

    @Override
    public boolean hasNext() {
        return postion<iteams.length;
    }
}

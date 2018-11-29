package study.txz.example.iterator;

/**
 * Created by Taxz on 2018/11/29/029.
 * GitHub:https://github.com/Taxz
 */
public class demo {


    public static void main(String[] args) {
        IMyIterator myIterator = new MyIteratorIml();
        Iterator<Integer> iterator = myIterator.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

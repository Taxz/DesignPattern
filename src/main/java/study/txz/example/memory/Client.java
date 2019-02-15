package study.txz.example.memory;

/**
 * Created by Taxz on 2019/2/15.
 */
public class Client {

    public static void main(String[] args) {
        Work work = new Work("memory");
        work.orignalData();
        MemoryTaker taker = new MemoryTaker();
        taker.setWork(work.saveWork());
        work.wayA();
        work.recovery(taker.recover());
        work.wayB();

    }
}

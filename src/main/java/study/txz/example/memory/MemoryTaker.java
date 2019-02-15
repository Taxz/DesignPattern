package study.txz.example.memory;

/**
 * Created by Taxz on 2019/2/15.
 */
public class MemoryTaker {
    private Memory work;

    public void setWork(Memory memory) {
        this.work = memory;
    }

    public Memory recover() {
        return this.work;
    }
}

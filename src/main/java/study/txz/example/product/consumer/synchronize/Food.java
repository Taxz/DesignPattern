package study.txz.example.product.consumer.synchronize;

/**
 * Created by Taxz on 2018/11/24/024.
 * GitHub:https://github.com/Taxz
 */
public class Food {
    int nums = 0;

    public synchronized int getNums() throws InterruptedException {
        if (nums == 0) {
            System.out.println(Thread.currentThread().getName()+"获取了："+nums+",等待...");
            this.wait();
        }
        System.out.println(Thread.currentThread().getName()+"获取了："+nums--+",并减1,释放并唤醒");
        this.notifyAll();
        return nums;
    }

    public synchronized void setNums() throws InterruptedException {
        if (nums != 0) {
            System.out.println(Thread.currentThread().getName()+"获取了："+nums+",等待....");
            this.wait();
        }
        System.out.println(Thread.currentThread().getName()+"获取了："+nums+"，并加1,释放并唤醒");
        this.nums = 1;
        this.notifyAll();
    }
}

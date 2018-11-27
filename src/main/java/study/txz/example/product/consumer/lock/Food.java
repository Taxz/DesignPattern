package study.txz.example.product.consumer.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * Created by Taxz on 2018/11/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Food {
    Lock lock;
    int num = 2;

    Condition product;
    Condition consumer;

    public Food(Lock lock) {
        this.lock = lock;
        this.product = lock.newCondition();
        this.consumer = lock.newCondition();
    }

    public void getNum() {
        lock.lock();
        try {
            while (num == 0) {
                System.out.println(Thread.currentThread().getName()+"获取:"+num+",等待......");
                consumer.await();
            }
            System.out.println(Thread.currentThread().getName()+"获取："+(num--)+",并自减1,唤醒product");
            product.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void setNum() {
        lock.lock();
        try {
            while (num > 0) {
                System.out.println(Thread.currentThread().getName()+"获取："+num+",等待。。。。");
                product.await();
            }
            System.out.println(Thread.currentThread().getName() + "获取：" + (this.num++) + ",并自加，唤醒consumer");
            consumer.signalAll();
        } catch (InterruptedException e) {

        }finally {
            lock.unlock();
        }
    }
}

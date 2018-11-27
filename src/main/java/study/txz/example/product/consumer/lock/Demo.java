package study.txz.example.product.consumer.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Taxz on 2018/11/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Demo {

    public static void main(String[] args) throws InterruptedException {
        /*Lock lock = new ReentrantLock();

        Food food = new Food(lock);

        Product product = new Product(food);
        Consumer consumer = new Consumer(food);

        Thread p = new Thread(product);
        p.setName("product");
        Thread c = new Thread(consumer);
        c.setName("consumer");

        c.start();
        p.start();*/
        test();
    }

    public static void test() {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        lock.lock();
        condition.signalAll();
        lock.unlock();
    }
}

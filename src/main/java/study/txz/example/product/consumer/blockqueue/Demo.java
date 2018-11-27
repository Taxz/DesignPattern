package study.txz.example.product.consumer.blockqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Taxz on 2018/11/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Demo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> array = new ArrayBlockingQueue<Integer> (1);
        Thread p = new Thread(new Consumer(array));
        p.setName("consumer");

        Thread c = new Thread(new Product(array));
        c.setName("product");

        c.start();
        Thread.sleep(1000);
        p.start();
    }
}

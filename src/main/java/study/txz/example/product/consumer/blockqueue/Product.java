package study.txz.example.product.consumer.blockqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Taxz on 2018/11/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Product implements Runnable{
    BlockingQueue<Integer> blockingDeque;

    public Product(BlockingQueue<Integer> blockingDeque) {
        this.blockingDeque = blockingDeque;
    }

    @Override
    public void run() {
        for (int i =0;i<10;i++) {
            try {
                blockingDeque.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"add :"+i);
        }
    }
}

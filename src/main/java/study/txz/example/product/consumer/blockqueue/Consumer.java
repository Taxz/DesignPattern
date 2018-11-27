package study.txz.example.product.consumer.blockqueue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by Taxz on 2018/11/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Consumer implements Runnable {
    BlockingQueue<Integer> blockingQeque;

    public Consumer(BlockingQueue<Integer> blockingQeque) {
        this.blockingQeque = blockingQeque;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            try {
                System.out.println(Thread.currentThread().getName()+"get:"+blockingQeque.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package study.txz.example.product.consumer.lock;

/**
 * Created by Taxz on 2018/11/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Consumer implements Runnable {
    Food food;

    public Consumer(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++)
        food.getNum();
    }
}

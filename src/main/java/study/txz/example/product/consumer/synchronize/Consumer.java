package study.txz.example.product.consumer.synchronize;

/**
 * Created by Taxz on 2018/11/24/024.
 * GitHub:https://github.com/Taxz
 */
public class Consumer implements Runnable{
    Food food;

    public Consumer(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i=1;i<11;i++) {
            try {
                //System.out.println(Thread.currentThread().getName()+"consumer消费次数"+i);
                food.getNums();
            } catch (InterruptedException e) {


            }
        }
       // this.notifyAll();
    }
}

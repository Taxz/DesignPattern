package study.txz.example.product.consumer.synchronize;

/**
 * Created by Taxz on 2018/11/24/024.
 * GitHub:https://github.com/Taxz
 */
public class Product implements Runnable {

    Food food;

    public Product(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i= 1;i<11;i++) {
            try {
                //System.out.println(Thread.currentThread().getName()+"生成次数:"+i);
                food.setNums();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //this.notifyAll();
    }
}

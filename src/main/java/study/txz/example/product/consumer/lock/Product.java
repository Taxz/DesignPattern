package study.txz.example.product.consumer.lock;

/**
 * Created by Taxz on 2018/11/25/025.
 * GitHub:https://github.com/Taxz
 */
public class Product implements Runnable {
    Food food;

    public Product(Food food) {
        this.food = food;
    }

    @Override
    public void run() {
        for (int i=0;i<9;i++) {
            food.setNum();
        }
    }
}

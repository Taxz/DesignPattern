package study.txz.example.product.consumer.synchronize;

/**
 * Created by Taxz on 2018/11/24/024.
 * GitHub:https://github.com/Taxz
 */
public class demo {
    public static void main(String[] args) throws InterruptedException {
        Food food = new Food();
        Thread consumer = new Thread(new Consumer(food));
        consumer.setName("consumer");

        Thread product = new Thread(new Product(food));
        product.setName("product");

        consumer.start();
        Thread.sleep(100);
        product.start();
    }
}

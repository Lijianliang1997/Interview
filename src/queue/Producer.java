package queue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

/**
 * Created by qq940 on 2018/3/6.
 */
public class Producer implements Runnable{
    BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> queue ) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String temp = "A product, 生产线程：" + Thread.currentThread().getName() + new Random().nextInt(10);
                System.out.println("I have made a product" + Thread.currentThread().getName());
                queue.put(temp);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

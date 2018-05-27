package queue;

import java.util.concurrent.BlockingQueue;

/**
 * Created by qq940 on 2018/3/6.
 */
public class Consumer implements Runnable {
    BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            while (queue != null) {
                String temp = queue.take();
                System.out.println(temp);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

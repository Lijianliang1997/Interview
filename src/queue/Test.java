package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by qq940 on 2018/3/6.
 */
public class Test {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingDeque<>(6); // 不设置的话， LinkedBlockingQueue 默认大小为Integer.MAX_VALUE
        Consumer consumer = new Consumer(queue);
        Consumer consumer1 = new Consumer(queue);
        Producer producer = new Producer(queue);
        new Thread(producer).start();
        new Thread(consumer).start();
        new Thread(consumer1).start();
    }
}

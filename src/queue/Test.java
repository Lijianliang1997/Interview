package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Created by qq940 on 2018/3/6.
 */
public class Test {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingDeque<>(6); // 不设置的话， LinkedBlockingQueue 默认大小为Integer.MAX_VALUE
        int n = 100;
        for (int i = 0; i < n; i ++) {
            new Thread(new Producer(queue), i+"").start();
            new Thread(new Consumer(queue), i+"1").start();
            new Thread(new Consumer(queue), i+"2").start();
        }
    }
}

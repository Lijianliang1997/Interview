package adv;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by qq940 on 2018/6/5.
 */
public class ExecutorCase {
    private static Executor executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for (int i = 0; i < 20; i ++) {
            executor.execute(new Task());
        }
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

package huawei;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qq940 on 2018/2/28.
 */
public class ThreadTest {
    private int j;
    private Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        for (int i = 0; i < 2; i ++) {
            new Thread(tt.new Adder()).start();
            new Thread(tt.new Subtractor()).start();
        }
    }

    private class   Subtractor implements Runnable {
        @Override
        public void run() {
            while (true) {
                lock.lock();
                try {
                    System.out.println(" j -- = " + j --);
                } finally {
                    lock.unlock();
                }
            }
        }
    }

    private class Adder implements Runnable
    {

        @Override
        public void run() {
            while(true)
            {
				/*synchronized (ThreadTest.this) {
				System.out.println("j++=" + j++);
				}*/
                lock.lock();
                try
                {
                    System.out.println("j++=" + j++);
                }finally
                {
                    lock.unlock();
                }
            }
        }

    }

}

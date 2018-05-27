package designPattern.task;

/**
 * Created by qq940 on 2018/2/22.
 */
public class Tester {
    public static void main(String[] args) {
        new LoggingRunnable(
            new TransactionRunnable( new CodingTask())).run();
    }
}

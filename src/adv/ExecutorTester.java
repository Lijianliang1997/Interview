package adv;

import designPattern.task.CodingTask;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by qq940 on 2018/2/23.
 */
public class ExecutorTester {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<?>> taskResults = new LinkedList<>();
        for (int i = 0; i < 10; i ++) {
             taskResults.add(executor.submit(new CodingTask(i)));
        }
        System.out.println("10 tasks dispatched successfully.");
//        for (Future<?> taskResult : taskResults) {
//            taskResult.get();
//        }
        executor.shutdown();
    }
}

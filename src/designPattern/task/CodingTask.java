package designPattern.task;

/**
 * Created by qq940 on 2018/2/22.
 */
public class CodingTask implements Runnable {
    private final int employeeId;

    public CodingTask(int employeeId) {
        this.employeeId = employeeId;
    }
    public CodingTask() {
        this.employeeId = 0;
    }

    @Override
    public void run() {
        System.out.println("Employee " + employeeId +" started writing code.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
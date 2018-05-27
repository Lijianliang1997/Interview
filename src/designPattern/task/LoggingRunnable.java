package designPattern.task;

/**
 * Created by qq940 on 2018/2/22.
 */
public  class LoggingRunnable implements Runnable {
    private final Runnable innerRunnable;

    public LoggingRunnable(Runnable runnable) {
        this.innerRunnable = runnable;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println("Task started at " + startTime);
        innerRunnable.run();
        System.out.println("Task finished. Elapsed time: " + (System.currentTimeMillis() - startTime));
    }

}

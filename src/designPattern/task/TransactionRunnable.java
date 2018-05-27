package designPattern.task;

/**
 * Created by qq940 on 2018/2/22.
 */
public  class TransactionRunnable implements Runnable {
    private final Runnable innerRunnable;

    public TransactionRunnable(Runnable innerRunnable) {
        this.innerRunnable = innerRunnable;
    }

    @Override
    public void run() {
        boolean shouldRollBack = false;
        try {
            beginTransaction();
            innerRunnable.run();
        } catch (Exception e) {
            shouldRollBack = true;
            throw e;
        } finally {
            if (shouldRollBack) {
                rollBack();
            } else {
                commit();
            }
        }
    }

    private void beginTransaction() {
        System.out.println("beginTransaction");
    }

    private void rollBack() {
        System.out.println("rollback");
    }

    private void commit() {
        System.out.println("commit");
    }


}

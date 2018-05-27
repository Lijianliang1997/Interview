package designPattern.company;

/**
 * Created by qq940 on 2018/2/22.
 */
public class Engineer implements Role {
    @Override
    public void doWork() {
        System.out.println("Engineering work");
    }

    @Override
    public String toString() {
        return "Engineer";
    }
}

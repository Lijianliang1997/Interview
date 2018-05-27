package designPattern.factoryPattern;

/**
 * Created by qq940 on 2018/3/6.
 */
public class NYStyleCheesePizza implements Pizza {
    @Override
    public void make() {
        System.out.println("NYStyleCheesePizza is making");
    }
}

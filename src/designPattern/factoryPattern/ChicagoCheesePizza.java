package designPattern.factoryPattern;

/**
 * Created by qq940 on 2018/3/6.
 */
public class ChicagoCheesePizza implements Pizza {
    @Override
    public void make() {
        System.out.println("ChicagoCheesePizza is making");
    }
}

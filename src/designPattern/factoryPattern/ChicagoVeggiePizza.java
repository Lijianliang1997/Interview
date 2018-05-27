package designPattern.factoryPattern;

/**
 * Created by qq940 on 2018/3/6.
 */
public class ChicagoVeggiePizza implements Pizza{
    @Override
    public void make() {
        System.out.println("ChicagoVeggiePizza is making");
    }
}

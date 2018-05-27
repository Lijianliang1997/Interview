package designPattern.factoryPattern;

/**
 * Created by qq940 on 2018/3/6.
 */
public class PizzaTestDriver {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("cheese");
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");
    }
}

package designPattern.factoryPattern;

/**
 * Created by qq940 on 2018/3/6.
 */
public class ChicagoPizzaStore implements PizzaStore {
    @Override
    public Pizza orderPizza(String item) {
        Pizza pizza = null;
        if (item.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        } else if (item.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        } else {
            throw new UnsupportedOperationException();
        }
        pizza.make();
        return pizza;
    }
}

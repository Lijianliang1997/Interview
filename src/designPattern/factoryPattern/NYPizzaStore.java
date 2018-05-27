package designPattern.factoryPattern;

/**
 * Created by qq940 on 2018/3/6.
 */
public class NYPizzaStore implements PizzaStore {
    @Override
    public Pizza orderPizza(String item) {
        Pizza pizza = null;
        if (item.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        } else {
            throw new UnsupportedOperationException();
        }
        pizza.make();
        return pizza;
    }
}

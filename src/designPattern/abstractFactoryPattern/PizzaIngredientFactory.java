package designPattern.abstractFactoryPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public interface PizzaIngredientFactory {
    public Dough createDough ();
    public Sauce createSauce ();
}

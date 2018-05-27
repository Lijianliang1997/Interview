package designPattern.abstractFactoryPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}

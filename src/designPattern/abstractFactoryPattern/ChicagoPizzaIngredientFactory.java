package designPattern.abstractFactoryPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}

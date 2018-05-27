package designPattern.abstractFactoryPattern;

/**
 * Created by qq940 on 2018/3/7.
 */
public class NYPizzaStore {
    private PizzaIngredientFactory ingredientFactory;

    public NYPizzaStore () {
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }

    public void makePizza () {
        Dough dough = ingredientFactory.createDough();
        Sauce sauce = ingredientFactory.createSauce();
        System.out.println(dough.doughType());
        System.out.println(sauce.sauceType());
    }
}

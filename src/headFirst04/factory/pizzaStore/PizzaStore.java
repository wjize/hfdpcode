package headFirst04.factory.pizzaStore;


import headFirst04.factory.pizza.Pizza;

/**
 * Created by wangjize on 2025/6/6.
 */
public abstract class PizzaStore {

    public abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

package com.siang.note.pizza.store;

import com.siang.note.pizza.factory.NYPizzaIngredientFactory;
import com.siang.note.pizza.factory.PizzaIngredientFactory;
import com.siang.note.pizza.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if ("cheese".equals(item)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(item)) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if ("clam".equals(item)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("pepperoni".equals(item)) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style pepperoni Pizza");
        }

        return pizza;
    }
}

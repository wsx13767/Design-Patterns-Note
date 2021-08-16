package com.siang.note.pizza.store;

import com.siang.note.pizza.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        return pizza;
    }

    /**
     * 如同工廠
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}

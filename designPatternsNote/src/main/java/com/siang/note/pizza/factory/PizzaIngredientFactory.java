package com.siang.note.pizza.factory;

import com.siang.note.pizza.material.cheese.Cheese;
import com.siang.note.pizza.material.clams.Clams;
import com.siang.note.pizza.material.dough.Dough;
import com.siang.note.pizza.material.pepperoni.Pepperoni;
import com.siang.note.pizza.material.sauce.Sauce;
import com.siang.note.pizza.material.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}

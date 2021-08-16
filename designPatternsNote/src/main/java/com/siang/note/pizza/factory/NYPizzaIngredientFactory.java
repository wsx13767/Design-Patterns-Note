package com.siang.note.pizza.factory;

import com.siang.note.pizza.material.cheese.Cheese;
import com.siang.note.pizza.material.cheese.ReggianoCheese;
import com.siang.note.pizza.material.clams.Clams;
import com.siang.note.pizza.material.clams.FreshClams;
import com.siang.note.pizza.material.dough.Dough;
import com.siang.note.pizza.material.dough.ThinCrustDough;
import com.siang.note.pizza.material.pepperoni.Pepperoni;
import com.siang.note.pizza.material.pepperoni.SlicedPepperoni;
import com.siang.note.pizza.material.sauce.MarinaraSauce;
import com.siang.note.pizza.material.sauce.Sauce;
import com.siang.note.pizza.material.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}

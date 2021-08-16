package com.siang.note.pizza.factory;

import com.siang.note.pizza.material.cheese.Cheese;
import com.siang.note.pizza.material.cheese.MozzarellaCheese;
import com.siang.note.pizza.material.clams.Clams;
import com.siang.note.pizza.material.clams.FrozenClams;
import com.siang.note.pizza.material.dough.Dough;
import com.siang.note.pizza.material.dough.ThickCrustDough;
import com.siang.note.pizza.material.pepperoni.Pepperoni;
import com.siang.note.pizza.material.pepperoni.SlicedPepperoni;
import com.siang.note.pizza.material.sauce.PlumTomatoSauce;
import com.siang.note.pizza.material.sauce.Sauce;
import com.siang.note.pizza.material.veggies.BlackOlives;
import com.siang.note.pizza.material.veggies.Eggplant;
import com.siang.note.pizza.material.veggies.Spinach;
import com.siang.note.pizza.material.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

	@Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}

package com.siang.note.pizza.pizza;

import com.siang.note.pizza.material.cheese.Cheese;
import com.siang.note.pizza.material.clams.Clams;
import com.siang.note.pizza.material.dough.Dough;
import com.siang.note.pizza.material.pepperoni.Pepperoni;
import com.siang.note.pizza.material.sauce.Sauce;
import com.siang.note.pizza.material.veggies.Veggies;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in officaial PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}

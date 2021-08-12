package com.siang.note.beverage;

import com.siang.note.beverage.condiment.Mocha;
import com.siang.note.beverage.condiment.Soy;
import com.siang.note.beverage.condiment.Whip;
import com.siang.note.beverage.production.Beverage;
import com.siang.note.beverage.production.DarkRoast;
import com.siang.note.beverage.production.Espresso;
import com.siang.note.beverage.production.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}

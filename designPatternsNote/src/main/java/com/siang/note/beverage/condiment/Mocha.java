package com.siang.note.beverage.condiment;

import com.siang.note.beverage.production.Beverage;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}

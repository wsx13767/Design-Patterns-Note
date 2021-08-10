package com.siang.note.duck;

import com.siang.note.duck.behavior.FlyNoWay;
import com.siang.note.duck.behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}

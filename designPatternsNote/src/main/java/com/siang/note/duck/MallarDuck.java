package com.siang.note.duck;

import com.siang.note.duck.behavior.FlyWithWings;
import com.siang.note.duck.behavior.Quack;

public class MallarDuck extends Duck {
    public MallarDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

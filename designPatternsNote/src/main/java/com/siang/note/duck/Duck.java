package com.siang.note.duck;

import com.siang.note.duck.behavior.FlyBehavior;
import com.siang.note.duck.behavior.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}

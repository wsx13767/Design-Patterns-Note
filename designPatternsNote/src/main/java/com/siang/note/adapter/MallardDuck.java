package com.siang.note.adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void flY() {
        System.out.println("I'm flying");
    }
}

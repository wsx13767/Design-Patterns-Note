package com.siang.note.adapter;


public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void flY() {
        for (int i = 0;i < 5;i++) {
            turkey.fly();
        }
    }
}

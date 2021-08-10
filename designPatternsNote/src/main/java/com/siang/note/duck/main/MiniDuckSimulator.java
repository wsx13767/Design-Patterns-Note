package com.siang.note.duck.main;

import com.siang.note.duck.Duck;
import com.siang.note.duck.MallarDuck;
import com.siang.note.duck.ModelDuck;
import com.siang.note.duck.behavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new ModelDuck();
        mallard.performFly();
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }
}

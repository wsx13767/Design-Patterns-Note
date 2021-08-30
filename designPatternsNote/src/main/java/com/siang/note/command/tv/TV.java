package com.siang.note.command.tv;

public class TV {
    String local;

    public TV(String local) {
        this.local = local;
    }

    public void on() {
        System.out.println(local + " TV is on");
    }

    public void off() {
        System.out.println(local + " TV is off");
    }
}

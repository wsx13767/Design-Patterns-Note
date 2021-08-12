package com.siang.note.beverage.production;

/**
 * 飲料
 */
public abstract class Beverage {
    protected String description = "Unknown Berverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

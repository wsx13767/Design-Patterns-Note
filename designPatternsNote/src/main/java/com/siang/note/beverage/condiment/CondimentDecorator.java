package com.siang.note.beverage.condiment;

import com.siang.note.beverage.production.Beverage;

/**
 * 配料
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}

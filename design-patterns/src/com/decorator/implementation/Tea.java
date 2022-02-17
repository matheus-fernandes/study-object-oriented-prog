package com.decorator.implementation;

import com.decorator.core.Beverage;

public class Tea implements Beverage {
    final static String MY_NAME = "tea";
    final static float MY_COST = 9.0f;
    @Override
    public String getName() {
        return MY_NAME;
    }

    @Override
    public float getCost() {
        return MY_COST;
    }
}

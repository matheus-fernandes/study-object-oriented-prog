package patterns.decorator.implementation;

import patterns.decorator.core.Beverage;

public class Coffee implements Beverage {
    final static String MY_NAME = "coffee";
    final static float MY_COST = 8.0f;

    @Override
    public String getName() {
        return MY_NAME;
    }

    @Override
    public float getCost() {
        return MY_COST;
    }
}

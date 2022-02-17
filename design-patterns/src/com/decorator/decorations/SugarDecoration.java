package com.decorator.decorations;

import com.decorator.core.Beverage;
import com.decorator.core.BeverageDecorator;

public class SugarDecoration extends BeverageDecorator {
    final static String MY_NAME = "chocolate";
    final static float MY_COST = 3.0f;

    public SugarDecoration(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getName() {
        return decorationOfNameWith(MY_NAME);
    }

    @Override
    public float getCost() {
        return decorationOfCostWith(MY_COST);
    }
}

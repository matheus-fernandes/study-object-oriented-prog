package patterns.decorator.decorations;

import patterns.decorator.core.Beverage;
import patterns.decorator.core.BeverageDecorator;

public class ChocolateDecoration extends BeverageDecorator {
    final static String MY_NAME = "chocolate";
    final static float MY_COST = 3.0f;

    public ChocolateDecoration(Beverage beverage) {
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

package patterns.decorator.decorations;

import patterns.decorator.core.Beverage;
import patterns.decorator.core.BeverageDecorator;

public class CaramelDecoration extends BeverageDecorator {
    final static String MY_NAME = "caramel";
    final static float MY_COST = 2.0f;

    public CaramelDecoration(Beverage beverage) {
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

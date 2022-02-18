package patterns.decorator.core;

public abstract class BeverageDecorator implements Beverage{
    protected final Beverage beverage;

    protected BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    protected float decorationOfCostWith(float myCost){
        return beverage.getCost() + myCost;
    }

    protected String decorationOfNameWith(String myName) {
        return beverage.getName() + " + " + myName;
    }
}

package patterns.decorator.core;

public interface Beverage {
    String getName();
    float getCost();

    default String getSummary(){
        String summary = "Product: \n" + getName() +
                         "\nCost: " + getCost() + "\n";

        return summary;
    }
}

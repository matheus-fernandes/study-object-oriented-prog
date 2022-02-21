package patterns.facade.restaurant;

import patterns.facade.beverages.Beverage;
import patterns.facade.options.BeverageOptions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Restaurant {
    protected Kitchen kitchen;

    public Restaurant(){
        this.kitchen = new Kitchen(Restaurant.myBeverages());
    }

    public Waiter askForWaiter(){
        return new Waiter(this);
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    static Map<String, Beverage> myBeverages(){
        return Arrays.stream(BeverageOptions.values()).map(BeverageOptions::getOption)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
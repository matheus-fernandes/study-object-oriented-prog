package patterns.facade.restaurant;

import patterns.facade.beverages.Beverage;

import java.util.Map;

public class Kitchen {
    Map<String, Beverage> beverages;

    public Kitchen(Map<String, Beverage> beverages){
        this.beverages = beverages;
    }

    public Beverage getBeverage(String beverageName){
        return beverages.get(beverageName);
    }
}
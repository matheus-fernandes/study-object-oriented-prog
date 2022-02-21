package patterns.facade.restaurant;

import patterns.facade.beverages.Beverage;

public class Waiter {
    private Restaurant restaurant;

    public Waiter(Restaurant restaurant){
        this.restaurant = restaurant;
    }

    public Beverage askForBeverage(String name){
        Kitchen kitchen = getKitchen();
        return kitchen.getBeverage(name);
    }

    private Kitchen getKitchen(){
        return restaurant.getKitchen();
    }
}
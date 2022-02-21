package examples;

import patterns.facade.beverages.Beverage;
import patterns.facade.restaurant.Restaurant;
import patterns.facade.restaurant.Waiter;

public class FacadeExample {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Waiter waiter = restaurant.askForWaiter();

        Beverage beverage1 = waiter.askForBeverage("beer");
        beverage1.drink();

        Beverage beverage2 = waiter.askForBeverage("wine");
        beverage2.drink();
    }
}
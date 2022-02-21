package patterns.facade.beverages;

import patterns.facade.beverages.Beverage;

import static java.lang.System.out;

public class Wine implements Beverage {
    @Override
    public void drink() {
        out.println("The wine has been drunk.");
    }
}
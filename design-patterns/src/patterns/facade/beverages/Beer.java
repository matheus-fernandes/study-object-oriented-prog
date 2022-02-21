package patterns.facade.beverages;

import static java.lang.System.out;

public class Beer implements Beverage {
    @Override
    public void drink() {
        out.println("The beer has been drunk.");
    }
}
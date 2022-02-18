package patterns.factorymethod.model;

import static java.lang.System.*;

public class Rattlesnake implements Animal{
    @Override
    public void speak() {
        out.println("Rattlee...");
    }
}

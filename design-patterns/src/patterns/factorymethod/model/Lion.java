package patterns.factorymethod.model;

import static java.lang.System.*;

public class Lion implements Animal {
    @Override
    public void speak() {
        out.println("Roar!!");
    }
}

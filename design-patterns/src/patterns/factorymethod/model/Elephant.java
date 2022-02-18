package patterns.factorymethod.model;

import static java.lang.System.*;

public class Elephant implements Animal{
    @Override
    public void speak() {
        out.println("Honk!");
    }
}

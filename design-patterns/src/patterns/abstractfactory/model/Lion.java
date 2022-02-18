package patterns.abstractfactory.model;

import patterns.abstractfactory.animal.Predator;

import static java.lang.System.out;

public class Lion implements Predator {
    @Override
    public void hunt() {
        out.println("Humm it seems tasty... Roar!");
    }
}

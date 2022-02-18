package patterns.abstractfactory.model;

import patterns.abstractfactory.animal.Predator;

import static java.lang.System.out;

public class Shark implements Predator {
    @Override
    public void hunt() {
        out.println("Chomp!");
    }
}

package patterns.abstractfactory.model;

import patterns.abstractfactory.animal.Pray;

import static java.lang.System.out;

public class Fish implements Pray {
    @Override
    public void run() {
        out.println("Glub glub ...");
    }
}

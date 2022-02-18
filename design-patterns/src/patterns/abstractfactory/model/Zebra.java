package patterns.abstractfactory.model;

import patterns.abstractfactory.animal.Pray;

import static java.lang.System.*;

public class Zebra implements Pray {
    @Override
    public void run() {
        out.println("OMG! Let me run...");
    }
}

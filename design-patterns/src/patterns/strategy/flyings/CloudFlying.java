package patterns.strategy.flyings;

import patterns.strategy.interfaces.FlyStrategy;

import static java.lang.System.*;

public class CloudFlying implements FlyStrategy {
    @Override
    public void fly() {
        out.println("I'm flying on the clouds!");
    }
}

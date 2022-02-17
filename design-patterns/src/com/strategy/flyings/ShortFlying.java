package com.strategy.flyings;

import com.strategy.interfaces.FlyStrategy;

import static java.lang.System.*;

public class ShortFlying implements FlyStrategy {
    @Override
    public void fly() {
        out.println("I'm flying short distances...");
    }
}

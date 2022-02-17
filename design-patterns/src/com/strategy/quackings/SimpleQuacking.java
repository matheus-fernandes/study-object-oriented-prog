package com.strategy.quackings;

import com.strategy.interfaces.QuackStrategy;

import static java.lang.System.*;

public class SimpleQuacking implements QuackStrategy {
    @Override
    public void quack() {
        out.println("Quack!");
    }
}

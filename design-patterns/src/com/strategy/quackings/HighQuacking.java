package com.strategy.quackings;

import com.strategy.interfaces.QuackStrategy;

import static java.lang.System.*;

public class HighQuacking implements QuackStrategy {
    @Override
    public void quack() {
        out.println("Quaaaaaaaack!!!");
    }
}

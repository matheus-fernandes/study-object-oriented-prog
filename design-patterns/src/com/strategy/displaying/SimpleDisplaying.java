package com.strategy.displaying;

import com.strategy.interfaces.DisplayStrategy;

import static java.lang.System.*;

public class SimpleDisplaying implements DisplayStrategy {
    @Override
    public void display() {
        out.println("Now you see me!");
    }
}

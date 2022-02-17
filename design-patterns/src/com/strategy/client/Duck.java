package com.strategy.client;

import com.strategy.interfaces.DisplayStrategy;
import com.strategy.interfaces.FlyStrategy;
import com.strategy.interfaces.QuackStrategy;

public class Duck {
    final private QuackStrategy toQuack;
    final private FlyStrategy toFly;
    final private DisplayStrategy toDisplay;

    public Duck(QuackStrategy quack, FlyStrategy fly, DisplayStrategy display){
        this.toQuack = quack;
        this.toDisplay = display;
        this.toFly = fly;
    }

    public void quack(){
        toQuack.quack();
    }

    public void fly(){
        toFly.fly();
    }

    public void display(){
        toDisplay.display();
    }

    public void go(){
        quack();
        display();
        fly();
    }
}

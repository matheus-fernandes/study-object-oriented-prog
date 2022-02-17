package com.examples;

import com.decorator.core.Beverage;
import com.decorator.decorations.CaramelDecoration;
import com.decorator.decorations.ChocolateDecoration;
import com.decorator.decorations.SugarDecoration;
import com.decorator.implementation.Coffee;
import com.decorator.implementation.Tea;

import static java.lang.System.*;

public class DecoratorExample {
    public static void main(String[] args) {
        out.println(teaWithSugar().getSummary());
        out.println(coffeeWithChocolate().getSummary());
        out.println(coffeeWithChocolateAndCaramel().getSummary());
    }

    static Beverage teaWithSugar(){
        Beverage beverage = new Tea();
        beverage = new SugarDecoration(beverage);
        return beverage;
    }

    static Beverage coffeeWithChocolate(){
        Beverage beverage = new Coffee();
        beverage = new ChocolateDecoration(beverage);
        return beverage;
    }

    static Beverage coffeeWithChocolateAndCaramel(){
        Beverage beverage = coffeeWithChocolate();
        beverage = new CaramelDecoration(beverage);
        return beverage;
    }
}

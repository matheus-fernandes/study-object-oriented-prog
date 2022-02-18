package examples;

import patterns.strategy.client.Duck;
import patterns.strategy.displaying.*;
import patterns.strategy.flyings.*;
import patterns.strategy.quackings.*;

import static java.lang.System.*;

public class StrategyExample {
    public static void main (String[] args){
        Duck cityDuck = getCityDuck();
        Duck wildDuck = getWildDuck();
        Duck rubberDuck = getRubberDuck();

        out.println("CITY DUCK:");
        cityDuck.go();

        out.println("\nWILD DUCK:");
        wildDuck.go();

        out.println("\nRUBBER DUCK:");
        rubberDuck.go();
    }

    static Duck getCityDuck(){
        return new Duck(
                new SimpleQuacking(),
                new ShortFlying(),
                new SimpleDisplaying()
        );
    }

    static Duck getWildDuck(){
        return new Duck(
                new HighQuacking(),
                new CloudFlying(),
                new SimpleDisplaying()
        );
    }

    static Duck getRubberDuck(){
        return new Duck(
                new SimpleQuacking(),
                new NoFlying(),
                new SimpleDisplaying()
        );
    }
}

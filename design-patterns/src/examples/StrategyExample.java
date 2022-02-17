package examples;

import com.strategy.client.Duck;
import com.strategy.displaying.*;
import com.strategy.flyings.*;
import com.strategy.quackings.*;

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

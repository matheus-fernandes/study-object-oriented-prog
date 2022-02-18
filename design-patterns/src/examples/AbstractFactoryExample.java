package examples;

import patterns.abstractfactory.animal.Pray;
import patterns.abstractfactory.animal.Predator;
import patterns.abstractfactory.factories.HuntingFactory;
import patterns.abstractfactory.factories.SavannahHuntingFactory;
import patterns.abstractfactory.factories.SeaHuntingFactory;

import static java.lang.System.out;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        out.println("--> Hunting at Savannah:");
        doHunting(new SavannahHuntingFactory());

        out.println("\n--> Hunting at Sea:");
        doHunting(new SeaHuntingFactory());
    }

    static void doHunting(HuntingFactory factory){
        Predator predator = factory.createPredator();
        Pray pray = factory.createPray();

        predator.hunt();
        pray.run();
    }
}

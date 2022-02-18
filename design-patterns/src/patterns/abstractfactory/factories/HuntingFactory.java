package patterns.abstractfactory.factories;

import patterns.abstractfactory.animal.Pray;
import patterns.abstractfactory.animal.Predator;

public interface HuntingFactory {
    Pray createPray();
    Predator createPredator();
}

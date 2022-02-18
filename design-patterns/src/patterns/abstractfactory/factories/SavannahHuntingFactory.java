package patterns.abstractfactory.factories;

import patterns.abstractfactory.animal.Pray;
import patterns.abstractfactory.animal.Predator;
import patterns.abstractfactory.model.Lion;
import patterns.abstractfactory.model.Zebra;

public class SavannahHuntingFactory implements HuntingFactory {
    @Override
    public Pray createPray() {
        return new Zebra();
    }

    @Override
    public Predator createPredator() {
        return new Lion();
    }
}

package patterns.abstractfactory.factories;

import patterns.abstractfactory.animal.Pray;
import patterns.abstractfactory.animal.Predator;
import patterns.abstractfactory.model.Fish;
import patterns.abstractfactory.model.Shark;

public class SeaHuntingFactory implements HuntingFactory{
    @Override
    public Pray createPray() {
        return new Fish();
    }

    @Override
    public Predator createPredator() {
        return new Shark();
    }
}

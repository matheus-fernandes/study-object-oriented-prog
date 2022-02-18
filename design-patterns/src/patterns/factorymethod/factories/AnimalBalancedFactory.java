package patterns.factorymethod.factories;

import patterns.factorymethod.core.Factory;
import patterns.factorymethod.model.Animal;
import patterns.factorymethod.model.Elephant;
import patterns.factorymethod.model.Lion;
import patterns.factorymethod.model.Rattlesnake;

public class AnimalBalancedFactory implements Factory<Animal> {
    private int index;

    public AnimalBalancedFactory(){
        this.index = 0;
    }

    @Override
    public Animal create() {
        if (index == 0){
            index ++;
            return new Elephant();
        }
        else if (index == 1){
            index ++;
            return new Lion();
        }
        else {
            index = 0;
            return new Rattlesnake();
        }
    }
}

package patterns.factorymethod.factories;

import patterns.factorymethod.core.Factory;
import patterns.factorymethod.model.Animal;
import patterns.factorymethod.model.Elephant;
import patterns.factorymethod.model.Lion;
import patterns.factorymethod.model.Rattlesnake;

import java.util.Random;

public class AnimalRandomFactory implements Factory<Animal> {
    private final Random random;

    public AnimalRandomFactory() {
        random = new Random();
    }

    @Override
    public Animal create() {
        int randomized = random.nextInt(3);

        if (randomized == 0){
            return new Elephant();
        }
        else if (randomized == 1){
            return new Lion();
        }
        else {
            return new Rattlesnake();
        }
    }
}

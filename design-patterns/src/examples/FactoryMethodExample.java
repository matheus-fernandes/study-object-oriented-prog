package examples;

import patterns.factorymethod.core.Factory;
import patterns.factorymethod.factories.AnimalBalancedFactory;
import patterns.factorymethod.factories.AnimalRandomFactory;
import patterns.factorymethod.model.Animal;

import static java.lang.System.*;

public class FactoryMethodExample {
    public static void main(String[] args) {
        out.println("--> Random Factory:");
        manufactureAnimals(6, new AnimalRandomFactory());

        out.println("\n--> Balanced Factory:");
        manufactureAnimals(6, new AnimalBalancedFactory());
    }

    static void manufactureAnimals(int quantity, Factory<Animal> factory){
        for (int i = 0; i < quantity; i ++){
            Animal animal = factory.create();
            animal.speak();
        }
    }
}

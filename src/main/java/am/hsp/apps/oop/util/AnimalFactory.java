package main.java.am.hsp.apps.oop.util;

import main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.context.Animal;
import main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.context.Bird;
import main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.context.Dog;

/**
 * Contains a method for creating a new animal according to the input.
 * 
 * @author user
 *
 */
public final class AnimalFactory {

    private static final char DOG = 'D';
    private static final char BIRD = 'B';

    /**
     * Private constructor for not allowing create an instance of this class.
     */
    private AnimalFactory() {
    }

    /**
     * Creates an animal according to the input.
     * 
     * @param animalType
     * @return
     */
    public static Animal make(char animalType) {
        switch (animalType) {
        case DOG:
            return new Dog();

        case BIRD:
            return new Bird();

        default:
            return null;
        }
    }
}

package main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy;

import main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.context.Animal;
import main.java.am.hsp.apps.oop.util.AnimalFactory;

/**
 * Demonstrating the animals flying capabilities.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        Animal dog = AnimalFactory.make('D');
        Animal bird = AnimalFactory.make('B');

        dog.showFlyingCapability();
        bird.showFlyingCapability();
    }
}

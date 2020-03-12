package main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.context;

import main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.FlyingInability;

/**
 * Contains attributes general for dogs.
 * 
 * @author user
 *
 */
public class Dog extends Animal {

    private static final String NAME = "Dog";

    /**
     * The default constructor.
     */
    public Dog() {
        this.name = NAME;
        this.flyingCapability = new FlyingInability();
    }

}

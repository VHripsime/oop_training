package main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.context;

import main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.FlyingAbility;

/**
 * Contains attributes general for birds.
 * 
 * @author user
 *
 */
public class Bird extends Animal {

    private static final String NAME = "Bird";

    /**
     * The default constructor, which defines the flying capability.
     */
    public Bird() {
        this.name = NAME;
        this.flyingCapability = new FlyingAbility();
    }
}

package main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.context;

import main.java.am.hsp.apps.oop.design_pattern.behavioural.strategy.FlyingCapability;

/**
 * Contains methods general for the all animal types.
 * 
 * @author user
 *
 */
public abstract class Animal {

    protected String name;
    protected String favouriteFood;
    protected double speed;
    protected String sound;
    protected FlyingCapability flyingCapability;

    /**
     * Shows whether the animal can fly.
     */
    public final void showFlyingCapability() {
        System.out.print(this.name + ": ");
        flyingCapability.fly();
    }

    /**
     * Returns the name of the animal.
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the favorite food of the animal.
     * 
     * @return
     */
    public String getFavouriteFood() {
        return favouriteFood;
    }

    /**
     * Returns the speed of the animal.
     * 
     * @return
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Returns the sound of the animal.
     * 
     * @return
     */
    public String getSound() {
        return sound;
    }

    /**
     * Returns the flying capability of the animal.
     * 
     * @return
     */
    public FlyingCapability getFlyingCapability() {
        return flyingCapability;
    }

    /**
     * Sets the name of the animal.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the favourite food of the animal.
     * 
     * @param favouriteFood
     */
    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    /**
     * Sets the speed of the animal.
     * 
     * @param speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Sets the sound of the animal.
     * 
     * @param sound
     */
    public void setSound(String sound) {
        this.sound = sound;
    }

    /**
     * Sets the flying capability of the animal.
     * 
     * @param flyingCapability
     */
    public void setFlyingCapability(FlyingCapability flyingCapability) {
        this.flyingCapability = flyingCapability;
    }
}

package main.java.am.hsp.apps.oop.design_pattern.creational.prototype;

/**
 * Contains attributes general for sheep type animals.
 * 
 * @author hripsime
 *
 */
public class Sheep extends Animal {

    /**
     * Constructor for initializing its memebers by the given inputs.
     * 
     * @param name
     * @param weight
     */
    public Sheep(String name, double weight) {
        super(name, weight);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * main.java.am.hsp.apps.oop.design_pattern.creational.prototype.Animal#
     * makeCopy ()
     */
    public Animal makeCopy() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }
}

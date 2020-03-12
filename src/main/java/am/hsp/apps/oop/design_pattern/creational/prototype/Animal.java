package main.java.am.hsp.apps.oop.design_pattern.creational.prototype;

/**
 * Contains attributes general to any type of animal.
 * 
 * @author hripsime
 *
 */
public abstract class Animal implements Cloneable {

    protected String name;
    protected double weight;

    /**
     * Constructor for initializing its memebers by the given inputs.
     * 
     * @param name
     * @param weight
     */
    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Returns a copy of an animal.
     * 
     * @return
     */
    public abstract Animal makeCopy() throws CloneNotSupportedException;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "Name: " + this.name + "\n" + "Weight: " + this.weight + "\n" + "Hashcode: " + this.hashCode();
    }

    /**
     * Returns the animal name.
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the animal name by the gievn input.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the animal weight.
     * 
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the animal weight by the given input.
     * 
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

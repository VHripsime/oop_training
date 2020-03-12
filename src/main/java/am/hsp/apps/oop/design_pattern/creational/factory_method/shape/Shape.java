package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape;

/**
 * Contains general methods, which must have all types of shape.
 * 
 * @author user
 *
 */
public abstract class Shape {

    protected String name;

    /**
     * Default constructor
     */
    public Shape() {
    }

    /**
     * Constructor for initializing the instance variable.
     * 
     * @param name
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Returns the surface of the current shape.
     * 
     * @return
     */
    public abstract double getSurface();

    /**
     * Prints the shape name and its' surface.
     */
    public final void draw() {
        System.out.println("The shape is: " + name);
        System.out.println("The surface is: " + getSurface());
    }
}

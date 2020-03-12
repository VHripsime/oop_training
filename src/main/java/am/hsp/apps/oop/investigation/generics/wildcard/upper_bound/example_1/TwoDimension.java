package main.java.am.hsp.apps.oop.investigation.generics.wildcard.upper_bound.example_1;

/**
 * Represents a two dimensional space.
 * 
 * @author user
 *
 */
public class TwoDimension {

    private double x;
    private double y;

    /**
     * Constructor for initializing the members by the given inputs.
     * 
     * @param x
     * @param y
     */
    public TwoDimension(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Returns the x coordinate.
     * 
     * @return
     */
    public double getX() {
        return this.x;
    }
    
    /**
     * Returns the y coordinate.
     * 
     * @return
     */
    public double getY() {
        return this.y;
    }
}

package main.java.am.hsp.apps.oop.investigation.generics.wildcard.upper_bound.example_1;

/**
 * Represents a three dimensional space.
 * 
 * @author user
 *
 */
public class ThreeDimension extends TwoDimension {

    private double z;

    /**
     * Constructor for initializing the members by the given inputs.
     * 
     * @param x
     * @param y
     * @param z
     */
    public ThreeDimension(double x, double y, double z) {
        super(x, y);

        this.z = z;
    }

    /**
     * Returns the z coordinate.
     * 
     * @return
     */
    public double getZ() {
        return this.z;
    }
}

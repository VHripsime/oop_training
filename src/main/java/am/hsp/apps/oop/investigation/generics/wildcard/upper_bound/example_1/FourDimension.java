package main.java.am.hsp.apps.oop.investigation.generics.wildcard.upper_bound.example_1;

/**
 * Represents a three dimensional space.
 * 
 * @author user
 *
 */
public class FourDimension extends ThreeDimension {

    double t;

    /**
     * Constructor for initializing the members by the given inputs.
     * 
     * @param x
     * @param y
     * @param z
     * @param t
     */
    public FourDimension(double x, double y, double z, double t) {
        super(x, y, z);

        this.t = t;
    }

    /**
     * Returns the t coordinate.
     * 
     * @return
     */
    public double getT() {
        return this.t;
    }
}

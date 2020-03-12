package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape;

/**
 * Contains some attributes for the Triangle class.
 * 
 * @author user
 *
 */
public class RightTriangle extends Triangle {

    private static final String SHAPE_NAME = "RightTriangle";
    private static final double FIRST_SIDE = 10;
    private static final double SECOND_SIDE = 20;
    private static final double ANGLE = 90;

    /**
     * Constructor for initializing the instance variable.
     */
    public RightTriangle() {
        this(SHAPE_NAME, FIRST_SIDE, SECOND_SIDE, ANGLE);
    }

    /**
     * Constructor for initializing the instance variable.
     * 
     * @param name
     */
    public RightTriangle(String name, double firstSide, double secondSide, double angle) {
        super(name, firstSide, secondSide, angle);
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.factory_method.shape.Shape#
     * surface()
     */
    public double getSurface() {
        return (firstSide * secondSide / 2);
    }
}

package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape;

/**
 * Contains some attributes for the Circle class.
 * 
 * @author user
 *
 */
public class Circle extends Shape {

    private static final String SHAPE_NAME = "Circle";
    private static final double RADIUS = 10;

    private double radius;

    /**
     * Constructor for initializing the instance variables.
     */
    public Circle() {
        this(SHAPE_NAME, RADIUS);
    }

    /**
     * Constructor for initializing the instance variable.
     * 
     * @param name
     */
    public Circle(String name, double radius) {
        super(name);

        this.radius = radius;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.factory_method.shape.Shape#
     * surface()
     */
    public double getSurface() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Returns the radius of the circle.
     * 
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     * 
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
}

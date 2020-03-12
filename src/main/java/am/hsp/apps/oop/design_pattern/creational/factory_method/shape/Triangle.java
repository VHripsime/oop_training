package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape;

/**
 * Contains some attributes for the Triangle class.
 * 
 * @author hripsime
 *
 */
public class Triangle extends Shape {

    protected double firstSide;
    protected double secondSide;
    protected double angle;

    /**
     * Default constructor
     */
    public Triangle() {
    }

    /**
     * Constructor for initializing the instance variable.
     * 
     * @param name
     */
    public Triangle(String name, double firstSide, double secondSide, double angle) {
        super(name);
        
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.angle = angle;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * main.java.am.hsp.apps.oop.design_pattern.factory_method.shape.base.Shape#
     * getSurface()
     */
    public double getSurface() {
        return (firstSide * secondSide * Math.sin(angle)) / 2;
    }

}

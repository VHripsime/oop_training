package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape;

/**
 * Contains attributes general for the Rectangle class.
 * 
 * @author user
 *
 */
public class Rectangle extends Shape {

    private static final String SHAPE_NAME = "Rectangle";
    private static final int HEIGHT = 10;
    private static final int WIDTH = 20;

    private double width;
    private double height;

    /**
     * Constructor for initializing the instance variable` name.
     */
    public Rectangle() {
        this(SHAPE_NAME, WIDTH, HEIGHT);
    }

    /**
     * Constructor for initializing the instance variables by the given
     * parameters.
     * 
     * @param name
     */
    public Rectangle(String name, double width, double height) {
        super(name);

        this.width = width;
        this.height = height;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.design_pattern.factory_method.shape.Shape#
     * surface()
     */
    public double getSurface() {
        return height * width;
    }

    /**
     * Returns the width of the rectangle.
     * 
     * @return
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width of the rectangle.
     * 
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Returns the height of the rectangle.
     * 
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the rectangle.
     * 
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

}

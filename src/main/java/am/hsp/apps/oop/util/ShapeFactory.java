package main.java.am.hsp.apps.oop.util;

import main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape.Circle;
import main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape.Rectangle;
import main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape.RightTriangle;
import main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape.Shape;

/**
 * Utility class for creating a shape object.
 * 
 * @author hripsime
 *
 */
public final class ShapeFactory {

    private static final char RECTANGLE = 'R';
    private static final char RIGHTTRIANGLE = 'T';
    private static final char CIRCLE = 'C';

    /**
     * Constructor for not allowing to initialize an object.
     */
    private ShapeFactory() {
    }

    /**
     * Returns an object corresponding to the input shape type.
     * 
     * @param shapeType
     * @return
     */
    public static Shape make(char shapeType) {
        switch (shapeType) {

        case RECTANGLE:
            return new Rectangle();

        case RIGHTTRIANGLE:
            return new RightTriangle();

        case CIRCLE:
            return new Circle();

        default:
            return null;

        }
    }
}

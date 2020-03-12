package main.java.am.hsp.apps.oop.design_pattern.creational.factory_method.shape;

import java.util.Scanner;

import main.java.am.hsp.apps.oop.util.ShapeFactory;

/**
 * Demonstrates the result of the given shape, which is being made dynamically.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        char shapeType = getUserInput();
        Shape shape = ShapeFactory.make(shapeType);

        shape.draw();
    }

    /**
     * Returns the user's input for shape type.
     * 
     * @return
     */
    public static char getUserInput() {
        System.out.println("Please enter the shape type: R(Rectangle), T(Right Triangle) or C(Circle):");

        Scanner scanner = new Scanner(System.in);

        return scanner.next().charAt(0);
    }
}

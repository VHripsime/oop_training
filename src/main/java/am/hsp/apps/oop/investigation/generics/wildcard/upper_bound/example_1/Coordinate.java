package main.java.am.hsp.apps.oop.investigation.generics.wildcard.upper_bound.example_1;

/**
 * A bounded wildcard is important, when we are creating a generic type, that
 * can operate on a class hierarchy. This class contains methods, which define
 * an upper bound for the wildcard.
 * 
 * @author user
 *
 * @param <T>
 */
public class Coordinate<T extends TwoDimension> {

    private T[] spaces;

    public Coordinate(T[] spaces) {
        this.spaces = spaces;
    }

    /**
     * Shows the X and Y coordinates of the given object.
     * 
     * @param group
     */
    public static void showXY(Coordinate<?> group) {
        System.out.println("The X and Y coordinates are:");

        for (int i = 0; i < group.spaces.length; i++) {
            System.out.println(group.spaces[i].getX() + ", " + group.spaces[i].getY());
        }
    }

    /**
     * Shows the X, Y and Z coordinates of each dimension in the given object.
     * Here ThreeDimension serves as the upper bound.
     * 
     * @param group
     */
    public static void showXYZ(Coordinate<? extends ThreeDimension> group) {
        System.out.println("The X, Y and Z coordinates are:");

        for (int i = 0; i < group.spaces.length; i++) {
            System.out.println(group.spaces[i].getX() + ", " + group.spaces[i].getY() + ", " + group.spaces[i].getZ());
        }
    }

    /**
     * Shows the X, Y, Z and T coordinates of each dimension in the given
     * object.
     * 
     * @param group
     */
    public static void showAll(Coordinate<? extends FourDimension> group) {
        System.out.println("The X, Y and Z coordinates are:");

        for (int i = 0; i < group.spaces.length; i++) {
            System.out.println(group.spaces[i].getX() + ", " + group.spaces[i].getY() + ", " + group.spaces[i].getZ()
                    + ", " + group.spaces[i].getT());
        }
    }
}

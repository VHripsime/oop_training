package main.java.am.hsp.apps.oop.investigation.generics.wildcard.upper_bound.example_1;

/**
 * Testing methods with bounded wildcards.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        FourDimension[] fourDimSpaces = { new FourDimension(2, 4, 1, -7), new FourDimension(5, 7, 0, 6),
                new FourDimension(3, 6, 14, 2) };

        Coordinate<FourDimension> spaces = new Coordinate<>(fourDimSpaces);

        Coordinate.showXY(spaces);

        System.out.println();
        Coordinate.showXYZ(spaces);

        System.out.println();
        Coordinate.showAll(spaces);
    }
}

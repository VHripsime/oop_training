package main.java.am.hsp.apps.oop.investigation.enums.nested_enums;

/**
 * We are allowed to create an enum inside an interface. Nested enum types are
 * implicitly static.
 * 
 * @author hripsime
 *
 */
public interface InsideInterface {

    enum Color {
        Blue, Red, Green;
    }

    public void print();

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(InsideInterface.Color.Blue);
    }
}

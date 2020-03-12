package main.java.am.hsp.apps.oop.investigation.enums.nested_enums;

/**
 * We are allowed to create an enum inside an interface. Nested enum types are
 * implicitly static.
 * 
 * @author hripsime
 *
 */
public interface InsideInnerInterface {

    interface Inner {

        static enum Color {
            Blue, Red, Green;
        }

        public void print();
    }

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(InsideInnerInterface.Inner.Color.Blue);
    }
}

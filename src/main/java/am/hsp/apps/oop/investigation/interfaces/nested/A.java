package main.java.am.hsp.apps.oop.investigation.interfaces.nested;

/**
 * A class constains nested interface. All nested interfaces are static by
 * default.
 * 
 * @author user
 *
 */
public class A {

    public static String h = "h";
    public I i;

    public int m(int i) {
        System.out.println("A");
        System.out.println(i);
        return i * 2;
    }

    static interface I {

        public int m = 3;

        static String getInfo() {
            return "in interface";
        }

        static String k() {
            return h;
        }
    }
}

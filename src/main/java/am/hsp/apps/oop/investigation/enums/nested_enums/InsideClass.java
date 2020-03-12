package main.java.am.hsp.apps.oop.investigation.enums.nested_enums;

/**
 * We can declare an enum inside a class. Nested enum types are implicitly
 * static.
 * 
 * @author hripsime
 *
 */
public class InsideClass {

    /**
     * As the enum class modifier is default, we can't call it from another package.
     * 
     * @author hripsime
     *
     */
    enum Numbers {
    ONE, TWO, THREE;
    }

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(InsideClass.Numbers.THREE);
    }
}

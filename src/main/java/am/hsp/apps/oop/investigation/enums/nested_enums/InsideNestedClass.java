package main.java.am.hsp.apps.oop.investigation.enums.nested_enums;

/**
 * We can declare an enum in a nested class, but not in an inner class. Nested
 * enum types are implicitly static.
 * 
 * @author hripsime
 *
 */
public class InsideNestedClass {

    public static class Nested {

        enum MyEnum {

            DESCRIPTION
        }
    }

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(InsideNestedClass.Nested.MyEnum.DESCRIPTION);
    }
}

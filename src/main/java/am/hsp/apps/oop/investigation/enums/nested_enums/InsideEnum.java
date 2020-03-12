package main.java.am.hsp.apps.oop.investigation.enums.nested_enums;

/**
 * It's legal to create an enum inside an enum. Nested enum types are implicitly
 * static.
 * 
 * @author hripsime
 *
 */
public enum InsideEnum {
    ;

    public enum Numbers {
        ONE, TWO {
            public String toString() {
                return "Overriding in TWO enum object";
            }
        },
        THREE;
    }

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(InsideEnum.Numbers.TWO);
        System.out.println(InsideEnum.Numbers.ONE);
    }
}

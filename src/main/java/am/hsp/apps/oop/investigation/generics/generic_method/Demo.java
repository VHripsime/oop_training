package main.java.am.hsp.apps.oop.investigation.generics.generic_method;

/**
 * It is possible to create a generic method that is enclosed within a
 * non-generic class.
 * 
 * @author hripsime
 *
 */
public class Demo {

    public static void main(String[] args) {

        Integer[] intElements = { 1, 8, 9, 7, 11 };
        String[] stringElements = { "one", "two", "three", "four", "five" };

        System.out.println("Does array contain 9?: " + isElementBelongToArray(9, intElements));
        System.out.println("Does array contain 71?: " + isElementBelongToArray(71, intElements));
        System.out.println("Does array contain seven?: " + isElementBelongToArray("seven", stringElements));
        System.out.println("Does array contain four?: " + isElementBelongToArray("four", stringElements));

        /*
         * The first argument is of type String, making T into String, but the
         * second argument is of type Integer, which is not a subclass of
         * String. This causes a compile-time type-mismatch error.
         */
        // System.out.println(isElementBelongToArray("seven", intElements));

    }

    /**
     * The type parameters are declared before the return type of the method.
     * 
     * @param element
     * @param array
     * @return
     */
    private static <T extends Comparable<T>, V extends T> boolean isElementBelongToArray(T element, V[] array) {
        for (int i = 0; i < array.length; i++) {
            if (element.equals(array[i])) {
                return true;
            }
        }

        return false;
    }
}

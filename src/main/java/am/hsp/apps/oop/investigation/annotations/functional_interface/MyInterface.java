package main.java.am.hsp.apps.oop.investigation.annotations.functional_interface;

/**
 * A functional interface is an interface that contains only one abstract
 * method.
 * 
 * @author user
 *
 */
@FunctionalInterface
public interface MyInterface {

    public void test();

    public default void print() {
        System.out.println("default method");
    }
}

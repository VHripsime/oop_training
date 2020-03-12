package main.java.am.hsp.apps.oop.investigation.generics.inheritance.overriding;

/**
 * A method in a generic class can be overridden just like any other method.
 * 
 * @author hripsime
 *
 */
public class A<T> {

    protected T object;

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param object
     */
    public A(T object) {
        this.object = object;
    }

    /**
     * Returns the object.
     * 
     * @return
     */
    public T getObject() {
        System.out.println("Executed the superclass method.");
        return this.object;
    }
}

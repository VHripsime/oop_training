package main.java.am.hsp.apps.oop.investigation.generics.inheritance.generic_superclass;

/**
 * A simple generic class.
 * 
 * @author hripsime
 *
 * @param <T>
 */
public class A<T> {

    protected T objectOfTypeT;

    /**
     * Constructor for initializing the instance members by the given input.
     * 
     * @param object
     */
    public A(T objectOfTypeT) {
        this.objectOfTypeT = objectOfTypeT;
    }

    /**
     * Returns the object.
     * 
     * @return
     */
    public T getObjectOfTypeT() {
        return this.objectOfTypeT;
    }
}

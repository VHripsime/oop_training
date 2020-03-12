package main.java.am.hsp.apps.oop.investigation.generics.inheritance.type_comparison;

public class A<T> {

    private T objectOfTypeT;

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

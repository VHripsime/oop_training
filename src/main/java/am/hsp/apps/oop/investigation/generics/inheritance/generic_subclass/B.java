package main.java.am.hsp.apps.oop.investigation.generics.inheritance.generic_subclass;

public class B<T> extends A {

    private T object;

    /**
     * Constructor for initializing the instance member by the given inputs.
     * 
     * @param object
     * @param i
     */
    public B(T object, int i) {
        super(i);
        this.object = object;
    }

    /**
     * Returns the object.
     * 
     * @return
     */
    public T getObject() {
        return this.object;
    }
}

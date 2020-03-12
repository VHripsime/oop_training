package main.java.am.hsp.apps.oop.investigation.generics.inheritance.overriding;

public class B<T> extends A<T> {

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param object
     */
    public B(T object) {
        super(object);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * main.java.am.hsp.apps.oop.investigation.generics.overriding.A#getObject()
     */
    public T getObject() {
        System.out.println("Executed the subclass method.");
        return this.object;
    }
}

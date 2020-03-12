package main.java.am.hsp.apps.oop.investigation.generics.raw_types;

/**
 * At the time of Generics, there is still pre-generics legacy code that
 * must remain both functional and compatible with generics. Pre-generics code
 * must be able to work with generics, and generic code must be able to work
 * with pre-generics code. To handle the transition to generics, Java allows a
 * generic class to be used without any type arguments. This creates a raw type
 * for the class.
 * 
 * @author hripsime
 *
 * @param <T>
 */
public class Raw<T> {

    private T element;

    /**
     * Constructor for initializing the instance variable by the given input.
     * 
     * @param element
     */
    public Raw(T element) {
        this.element = element;
    }

    /**
     * Returns the element.
     * 
     * @return
     */
    public T getElement() {
        return element;
    }
}

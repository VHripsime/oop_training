package main.java.am.hsp.apps.oop.investigation.generics.restrictions;

/**
 * A generic class cannot extend Throwable. This means that we cannot create
 * generic exception classes.
 * 
 * @author user
 *
 * @param <T>
 */
public class Demo<T> /* extends Throwable */ {

    /*
     * No static member can use a type parameter declared by the enclosing class.
     */
    // private static T instance;

    private T data;

    // We can't declare an array of references to a specific generic type:
    // Demo<Integer> gens[] = new Demo<Integer>[10];

    /*
     * We can create an array of references to a generic type if we use the
     * wildcard.
     */
    Demo<?> array[] = new Demo<?>[10];

    /**
     * It is not possible to create an instance of a type parameter.
     * 
     * @param object
     */
    public Demo(T object) {
        // data = new T();
    }
}

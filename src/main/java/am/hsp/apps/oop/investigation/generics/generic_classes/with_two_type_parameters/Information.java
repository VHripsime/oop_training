package main.java.am.hsp.apps.oop.investigation.generics.generic_classes.with_two_type_parameters;

/**
 * We can declare more than one type parameter in a generic type.
 * 
 * @author hripsime
 *
 * @param <T>
 * @param <V>
 */
public class Information<T, V> {

    private T id;
    private V password;

    /**
     * Constructor for setting the instance variables by the given inputs.
     * 
     * @param id
     * @param password
     */
    public Information(T id, V password) {
        this.id = id;
        this.password = password;
    }

    /**
     * Prints the type of the id and password.
     */
    public void showTypes() {
        System.out.println("The id type is: " + this.id.getClass().getSimpleName());
        System.out.println("The password type is: " + this.password.getClass().getSimpleName());
    }

    /**
     * Returns the id.
     * 
     * @return
     */
    public T getId() {
        return this.id;
    }

    /**
     * Returns the password.
     * 
     * @return
     */
    public V getPassword() {
        return this.password;
    }
}

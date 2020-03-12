package main.java.am.hsp.apps.oop.investigation.generics.generic_classes.with_one_type_parameter;

/**
 * Creating our own generic class...
 * 
 * @author user
 *
 * @param <T>
 */
public class Information<T> {

    private T data;

    /**
     * Assigns data to the given object.
     * 
     * @param object
     */
    public Information(T object) {
        this.data = object;
    }

    public void showType() {
        System.out.println("The data type is: " + data.getClass().getSimpleName());
    }

    /**
     * Returns the data.
     * 
     * @return
     */
    public T getData() {
        return this.data;
    }
}

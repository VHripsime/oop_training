package main.java.am.hsp.apps.oop.investigation.generics.bounded_type.example_2;

/**
 * We can create an upper bound for a type parameter, which declares the
 * superclass from which all type arguments must be derived. This is done
 * through the 'extends' clause.
 * 
 * @author hripsime
 *
 * @param <T>
 */
public class Operation<T extends Number> {

    private T[] array;

    /**
     * Constructor for initializing the array with the given one.
     * 
     * @param array
     */
    public Operation(T[] array) {
        this.array = array;
    }

    /**
     * Returns the average value of the given array elements.
     * 
     * @return
     */
    public double getAverage() {
        return getSumOfElements(array) / array.length;
    }

    /**
     * Returns the sum of the given array elements in double data type.
     * 
     * @param array
     * @return
     */
    private double getSumOfElements(T[] array) {
        double sum = 0.0;

        for (int i = 0; i < array.length; i++) {
            sum += getDoubleValue(array[i]);
        }

        return sum;
    }

    /**
     * Returns the given number in double type.
     * 
     * @param number
     * @return
     */
    private double getDoubleValue(T number) {
        return number.doubleValue();
    }
}

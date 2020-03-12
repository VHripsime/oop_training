package main.java.am.hsp.apps.oop.investigation.generics.wildcard.unbounded;

/**
 * The wildcard argument is specified by the ?, and it represents an unknown
 * type. This is governed by the extends clause in the Operation declaration.
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
     * Checks whether the current array elements average is equal to the given
     * array average.
     * 
     * @param array
     * @return
     */
    public boolean isAverageSame(Operation<?> array) {
        return (getAverage() == array.getAverage());
    }

    /**
     * Returns the average value of the given array elements.
     * 
     * @return
     */
    private double getAverage() {
        return getSumOfElements(array) / array.length;
    }

    /**
     * Returns the sum of the given array elements in double data type.
     * 
     * @param array
     * @return
     */
    private double getSumOfElements(T[] array) {
        double sum = 0;

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

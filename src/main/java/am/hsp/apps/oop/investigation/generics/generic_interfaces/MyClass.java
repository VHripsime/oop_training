package main.java.am.hsp.apps.oop.investigation.generics.generic_interfaces;

/**
 * If a class implements a generic interface, then that class must also be
 * generic.
 * 
 * @author hripsime
 *
 * @param <T>
 */
public class MyClass<T extends Comparable<T>> implements MinMax<T> {

    private T[] array;

    /**
     * Constructor for setting the member by the given array.
     * 
     * @param array
     */
    public MyClass(T[] array) {
        this.array = array;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.investigation.generics.generic_interfaces.
     * MinMax# min()
     */
    public T min() {
        T minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (isFirstValueLessThanSecondOne(array[i], minValue)) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    /**
     * Checks whether the first value is less than the second one.
     * 
     * @param firstValue
     * @param secondValue
     * @return
     */
    private boolean isFirstValueLessThanSecondOne(T firstValue, T secondValue) {
        return (firstValue.compareTo(secondValue) < 0);
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.investigation.generics.generic_interfaces.
     * MinMax# max()
     */
    public T max() {
        T maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (isFirstValueMoreThanSecondOne(array[i], maxValue)) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }

    /**
     * Checks whether the first value is more than the second one.
     * 
     * @param firstValue
     * @param secondValue
     * @return
     */
    private boolean isFirstValueMoreThanSecondOne(T firstValue, T secondValue) {
        return (firstValue.compareTo(secondValue) > 0);
    }
}

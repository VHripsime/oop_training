package main.java.am.hsp.apps.oop.data_structures.stack;

import java.util.Arrays;

import main.java.am.hsp.apps.oop.data_structures.stack.base.IntStack;

/**
 * Contains methods for working with dynamic stack.
 * 
 * @author hripsime
 *
 */
public class DynamicIntStack extends IntStack {

    private static final int INCREASE_FACTOR = 2;

    /**
     * Default constructor.
     */
    public DynamicIntStack() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.stack.base.Stack#push(int)
     */
    public void push(int element) {
        if (isArrayFull()) {
            increaseArrayLength();
        }

        array[++tos] = element;
    }

    /**
     * Increases the array length by the given factor.
     */
    private void increaseArrayLength() {
        array = Arrays.copyOf(array, array.length * INCREASE_FACTOR);
    }
}

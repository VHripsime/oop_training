package main.java.am.hsp.apps.oop.data_structures.stack.base;

/**
 * Contains methods related to stack data structures, which datum are integer
 * type.
 * 
 * @author user
 *
 */
public abstract class IntStack implements Stack {

    private static final int NOT_FOUND = -1;
    private static final int DEFAULT_VALUE = 0;
    private static final int LENGTH = 5;
    protected static final String MESSAGE_FOR_EMPTY_ARRAY = "\nThe array is empty.";
    protected static final String MESSAGE_FOR_FULL_ARRAY = "\nThe array is already filled.";

    protected int[] array;
    protected int tos;

    /**
     * Constructor for initializing the instance members.
     */
    public IntStack() {
        array = new int[LENGTH];
        tos = NOT_FOUND;
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.stack.Stack#pop()
     */
    public final int pop() {
        if (isArrayEmpty()) {
            System.out.println(MESSAGE_FOR_EMPTY_ARRAY);
            return 0;
        }

        int popedElement = array[tos];
        array[tos--] = DEFAULT_VALUE;

        return popedElement;
    }

    /**
     * Checks whether the array is empty.
     * 
     * @return
     */
    protected boolean isArrayEmpty() {
        return (tos == NOT_FOUND);
    }

    /**
     * Checks whether the array is full.
     * 
     * @return
     */
    protected boolean isArrayFull() {
        return (tos == (array.length - 1));
    }
}

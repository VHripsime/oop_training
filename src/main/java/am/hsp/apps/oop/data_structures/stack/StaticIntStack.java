package main.java.am.hsp.apps.oop.data_structures.stack;

import main.java.am.hsp.apps.oop.data_structures.stack.base.IntStack;

/**
 * Contains methods for working with fixed-size stack.
 * 
 * @author hripsime
 *
 */
public class StaticIntStack extends IntStack {

    /**
     * Constructor for initializing the instance members.
     */
    public StaticIntStack() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see main.java.am.hsp.apps.oop.data_structures.stack.Stack#push(int)
     */
    public void push(int element) {
        if (isArrayFull()) {
            System.out.println(MESSAGE_FOR_FULL_ARRAY);
        } else {
            array[++tos] = element;
        }
    }
}

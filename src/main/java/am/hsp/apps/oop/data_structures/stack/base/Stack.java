package main.java.am.hsp.apps.oop.data_structures.stack.base;

/**
 * Contains general methods for dealing with stack data structures.
 * 
 * @author hripsime
 *
 */
public interface Stack {

    /**
     * Pushes the given element into the array.
     * 
     * @param element
     */
    void push(int element);

    /**
     * Returns the element from the stack, then removes that element by
     * assigning the default value to it.
     * 
     * @return
     */
    int pop();
}

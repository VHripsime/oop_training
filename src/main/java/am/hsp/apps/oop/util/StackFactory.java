package main.java.am.hsp.apps.oop.util;

import main.java.am.hsp.apps.oop.data_structures.stack.DynamicIntStack;
import main.java.am.hsp.apps.oop.data_structures.stack.StaticIntStack;
import main.java.am.hsp.apps.oop.data_structures.stack.base.Stack;

/**
 * Utility class for creating a stack data structure.
 * 
 * @author hripsime
 *
 */
public final class StackFactory {

    private static final char STATIC_STACK_TYPE = 'S';
    private static final char DYNAMIC_STACK_TYPE = 'D';

    /**
     * Private constructor for not allowing to initialize an object.
     */
    private StackFactory() {
    }

    /**
     * Returns an object corresponding to the input stack type.
     * 
     * @param stackType
     * @return
     */
    public static Stack makeStack(char stackType) {
        switch (stackType) {

        case STATIC_STACK_TYPE:
            return new StaticIntStack();

        case DYNAMIC_STACK_TYPE:
            return new DynamicIntStack();

        default:
            return null;
        }
    }
}

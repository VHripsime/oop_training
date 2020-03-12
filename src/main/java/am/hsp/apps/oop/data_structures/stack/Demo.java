package main.java.am.hsp.apps.oop.data_structures.stack;

import main.java.am.hsp.apps.oop.data_structures.stack.base.Stack;
import main.java.am.hsp.apps.oop.util.GeneralMethods;
import main.java.am.hsp.apps.oop.util.StackFactory;

/**
 * Demonstrating how stack data structure works.
 * 
 * @author hripsime
 *
 */
public class Demo {

    private static final int PUSH_CASE = 1;
    private static final int POP_CASE = 2;
    private static final int STOP_CASE = 3;
    private static final int NOT_FOUND = -1;

    private static final String MESSAGE_FOR_STACK_TYPE = "Please enter the stack type: S(static) or D(dynamimc): ";
    private static final String MESSAGE_FOR_OPERATION_TYPE = "\nFor pushing press 1, for poping press 2, for stopping press 3: ";
    private static final String MESSAGE_FOR_PUSH = "Please enter an element: ";
    private static final String MESSAGE_FOR_POP = "The element is: ";
    private static final String MESSAGE_FOR_INVALID_INPUT = "Please enter a valid input.";

    public static void main(String[] args) {

        char stackType = GeneralMethods.getUserCharInput(MESSAGE_FOR_STACK_TYPE);
        Stack stack = StackFactory.makeStack(stackType);

        generate(stack);
    }

    /**
     * Generates a stack data structure and works on its' elements depending on
     * the input operation type.
     * 
     * @param stack
     */
    public static void generate(Stack stack) {
        int operationType = NOT_FOUND;

        do {
            operationType = GeneralMethods.getUserIntInput(MESSAGE_FOR_OPERATION_TYPE);

            executeGivenOperation(stack, operationType);

        } while (operationType != STOP_CASE);
    }

    /**
     * Does an operation based on the inputed operation type.
     * 
     * @param stack
     * @param operationType
     */
    public static void executeGivenOperation(Stack stack, int operationType) {
        switch (operationType) {

        case PUSH_CASE:
            stack.push(GeneralMethods.getUserIntInput(MESSAGE_FOR_PUSH));
            break;

        case POP_CASE:
            System.out.println(MESSAGE_FOR_POP + stack.pop());
            break;

        case STOP_CASE:
            break;

        default:
            System.out.println(MESSAGE_FOR_INVALID_INPUT);
        }
    }
}

package main.java.am.hsp.apps.oop.investigation.basics;

import java.util.Scanner;

public class SwitchDemo1 {

    public static void main(String[] args) {
        int number1 = getUserInput("Please enter the first number: ");
        int number2 = getUserInput("Please enter the second number: ");
        int operationNumber = getUserInput("Please enter the operation: ");

        showResult(number1, number2, operationNumber);

    }

    /**
     * Returns user's input in integer form.
     * 
     * @param message
     * @return
     */

    private static int getUserInput(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static char getOperationType(int operationNumber) {
        switch (operationNumber) {
        case 1:
            return '+';
        case 2:
            return '-';
        case 3:
            return '*';
        case 4:
            return '/';
        default:
            return ' ';
        }
    }

    /**
     * Returns the result according to the operation type.
     * 
     * @param number1
     * @param number2
     * @param operationType
     * @return
     */

    public static int getOperationResult(int number1, int number2, char operationType) {

        switch (operationType) {
        case '+':
            return (number1 + number2);
        case '-':
            return (number1 - number2);
        case '*':
            return (number1 * number2);
        case '/':
            return (number1 / number2);
        default:
            return -999;
        }
    }

    /**
     * Shows user's input numbers and the numbers operation result.
     * 
     * @param number1
     * @param number2
     * @param operationNumber
     */

    public static void showResult(int number1, int number2, int operationNumber) {

        System.out.println("The result: " + number1 + " " + getOperationType(operationNumber) + " " + number2 + " = "
                + getOperationResult(number1, number2, getOperationType(operationNumber)));
    }
}
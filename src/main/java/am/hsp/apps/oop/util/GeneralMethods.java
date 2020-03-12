package main.java.am.hsp.apps.oop.util;

import java.util.Scanner;

/**
 * Contains general methods necessary for solving various types of tasks.
 * 
 * @author hripsime
 *
 */
public final class GeneralMethods {

    /**
     * Default constructor.
     */
    private GeneralMethods() {
    }

    /**
     * Returns user's input in the char type.
     * 
     * @param message
     * @return
     */
    public static char getUserCharInput(String message) {
        System.out.print(message);

        Scanner scanner = new Scanner(System.in);

        return scanner.next().charAt(0);
    }

    /**
     * Returns user's input in integer type.
     * 
     * @param message
     * @return
     */
    public static int getUserIntInput(String message) {
        System.out.print(message);

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}

package main.java.am.hsp.apps.oop.investigation.exceptions;

/**
 * This will infinitely run.
 * 
 * @author hripsime
 *
 */
public class Puzzle1 {

    public static void main(String[] args) {

        try {
            main(args);
        } catch (StackOverflowError e) {
            main(args);
        }
    }
}

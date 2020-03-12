package main.java.am.hsp.apps.oop.investigation.exceptions;

/**
 * What will be the output?
 * 
 * @author hripsime
 *
 */
public class Puzzle42 {

    public static void main(String[] args) {

        int[][] tests = { { 6, 5, 4, 3, 2, 1 }, { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 }, { 1 } };
        int count = 0;

        try {
            int i = 0;
            while (true) {
                if (thirdElementIsThree(tests[i++])) {
                    count++;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // No more tests to process
        }

        System.out.println(count);
    }

    private static boolean thirdElementIsThree(int[] a) {
        return a.length >= 3 & a[2] == 3;
    }
}
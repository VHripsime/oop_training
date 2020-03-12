package main.java.am.hsp.apps.oop.investigation.exceptions.try_finally;

/**
 * At first finally block will be executed, then the try block result will be
 * printed.
 * 
 * @author hripsime
 *
 */
public class ExecutionOrder2 {

    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int n) {
        try {
            int r = n * n;
            return r;

        } finally {
            System.out.println("finally");
        }
    }
}

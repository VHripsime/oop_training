package main.java.am.hsp.apps.oop.investigation.exceptions.try_finally;

/**
 * 
 * Simply put, the program tries to return true but finally it returns false .
 * 
 * @author hripsime
 *
 */
public class ExecutionOrder3 {

    /**
     * The result is false.
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(decision());
    }

    private static boolean decision() {
        try {
            return true;
        } finally {
            return false;
        }

    }

}

package main.java.am.hsp.apps.oop.investigation.exceptions.try_finally;

/**
 * At first finally block will be executed, then the exception will be thrown
 * from the try block.
 * 
 * @author hripsime
 *
 */
public class ExecutionOrder1 {

    public static void main(String[] args) {
       
        try {
            System.out.println(7 / 3);
            throw new NullPointerException();

        } finally {
            System.out.println("End");
        }
    }
}

package main.java.am.hsp.apps.oop.investigation.multithreading.join_method.thread_join;

/**
 * A simple Runnable class.
 * 
 * @author user
 *
 */
public class Operation implements Runnable {

    private String message;

    public Operation(String message) {
        this.message = message;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
        }
    }
}

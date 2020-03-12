package main.java.am.hsp.apps.oop.investigation.multithreading.yield_method;

/**
 * A simple customized thread class.
 * 
 * yield() method causes to pause the current executing thread for giving a
 * chance to execute the other threads with same or high priority. Thread
 * scheduler is free to ignore this hint.
 * 
 * @author user
 *
 */
public class MyThread extends Thread {

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Child thread");
            this.setPriority(10);
        }
    }
}

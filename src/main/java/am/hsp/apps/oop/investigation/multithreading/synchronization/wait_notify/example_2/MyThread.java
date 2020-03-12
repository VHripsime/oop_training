package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization.wait_notify.example_2;

/**
 * A Thread class, which increases its public instance member.
 * 
 * @author user
 *
 */
public class MyThread implements Runnable {

    public int sum;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        synchronized (this) {
            System.out.println("Child thread is calculating...");

            calculateSum(100);

            System.out.println("Child thread is notifying...");
            this.notify();
        }
    }

    /**
     * Increases the sum up to the given adder.
     * 
     * @param lastAddend
     */
    private synchronized void calculateSum(int lastAdder) {
        sum = lastAdder * (lastAdder + 1) / 2;
    }
}

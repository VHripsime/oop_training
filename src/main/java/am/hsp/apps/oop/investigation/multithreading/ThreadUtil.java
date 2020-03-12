package main.java.am.hsp.apps.oop.investigation.multithreading;

/**
 * Contains general thread methods.
 * 
 * @author user
 *
 */
public final class ThreadUtil {

    /**
     * Private constructor preventing from object creation.
     */
    private ThreadUtil() {
    }

    /**
     * Sleeps the thread by the given time.
     * 
     * @param milliseconds
     */
    public static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println("Got interrupted.");
        }
    }

    /**
     * Makes the thread to wait.
     * 
     * @param milliseconds
     */
    public static void wait(Object object) {
        try {
            object.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Makes the thread to wait up to given time.
     * 
     * @param milliseconds
     */
    public static void wait(Object object, long milliseconds) {
        try {
            object.wait(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Starts all the given threads.
     * 
     * @param threads
     */
    public static void start(Thread... threads) {
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }

    /**
     * Calls join() on all the given threads.
     * 
     * @param threads
     */
    public static void join(Thread... threads) {
        try {

            for (int i = 0; i < threads.length; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

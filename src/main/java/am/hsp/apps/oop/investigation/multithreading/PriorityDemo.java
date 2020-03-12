package main.java.am.hsp.apps.oop.investigation.multithreading;

/**
 * Priorities help to order the threads that are in the run queue.
 * 
 * Even a lower priority thread will be given time to run. Higher priority
 * threads are given time sliced to run more often, but it does not mean lower
 * priority threads will wait for them to finish before running themselves.
 * 
 * @author user
 *
 */
public class PriorityDemo {

    public static volatile boolean FLAG = false;

    public static void main(String[] args) {

        Thread[] threads = new Thread[32];

        initialize(threads);
        setPriorities(threads);
        start(threads);

        ThreadUtil.sleep(1000);
        FLAG = true;
    }

    /**
     * Initializes all the threads.
     * 
     * @param threads
     */
    private static void initialize(Thread[] threads) {
        for (int i = 0; i < 32; i++) {
            threads[i] = getThread(i);
        }
    }

    /**
     * Returns a thread object.
     * 
     * @param index
     * @return
     */
    private static Thread getThread(int index) {
        return new Thread(getRunnable(index));
    }

    /**
     * Returns a Runnable object.
     * 
     * @param index
     * @return
     */
    private static Runnable getRunnable(int index) {
        return new Runnable() {
            public void run() {
                for (long i = 0; i < 1_000_000_000; i++) {
                    if (FLAG) {
                        System.out.println(index + " : " + i);
                        break;
                    }
                }
            }
        };
    }

    /**
     * Sets min priority to the half of threads and max priority to the other half.
     * 
     * @param threads
     */
    private static void setPriorities(Thread[] threads) {
        for (int i = 0; i < 32; i++) {
            threads[i].setPriority(i < 16 ? Thread.MIN_PRIORITY : Thread.MAX_PRIORITY);
        }
    }

    /**
     * Starts all the threads.
     * 
     * @param threads
     */
    private static void start(Thread[] threads) {
        for (int i = 0; i < 32; i++) {
            threads[i].start();
        }
    }
}

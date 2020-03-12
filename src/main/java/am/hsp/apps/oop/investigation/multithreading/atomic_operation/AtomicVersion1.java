package main.java.am.hsp.apps.oop.investigation.multithreading.atomic_operation;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Now we are trying to make the incremental operation atomic by using a
 * synchronized method.
 * 
 * Now it is guaranteed the result with 2.000.000.
 * 
 * @author user
 *
 */
public class AtomicVersion1 {

    private static int NUMBER = 1_000_000;
    private static int COUNTER = 0;

    /**
     * Sometimes scheduler decides to terminate an active thread, though it has not
     * finished his work in synchronized method. In this case, no other thread can
     * enter the method, as it is assumed the previous thread has not freed the
     * method yet.
     * 
     * This slows the program down.
     */
    public static synchronized void increment() {
        COUNTER++;
    }

    public static void main(String[] args) throws InterruptedException {

        /*
         * Every thread has its own variables N and counter recorded on their own
         * caches.It is so, as the logical part is done by the Arithmetic Logic Unit. We
         * have no guarantee, that the value of the counter will be moved from the
         * caches to the shared memory after every iteration.
         */
        Thread firstThread = getThread();

        /*
         * Actually we don't know when it will start. We have no guarantee that the
         * thread will immediately start.
         */
        firstThread.start();

        Thread secondThread = getThread();
        secondThread.start();

        ThreadUtil.join(firstThread, secondThread);

        System.out.println(COUNTER);
    }

    /**
     * Creates and returns a thread, which increases the counter by 1 in each
     * iteration.
     * 
     * @return
     */
    private static Thread getThread() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < NUMBER; i++) {
                    increment();
                }
            }
        });

        return thread;
    }
}

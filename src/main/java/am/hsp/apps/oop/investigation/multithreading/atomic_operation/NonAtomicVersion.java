package main.java.am.hsp.apps.oop.investigation.multithreading.atomic_operation;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * In this example two threads increment the "counter" 1.000.000 times. After
 * calling join() method to both of them, we print the counter. The result is
 * not 2.000.000 as expected, though we declared counter volatile.
 * 
 * The reason is, that the incremental operation is not atomic. It is consists
 * of 3 parts: reading, incrementing and writing.
 * 
 * @author user
 *
 */
public class NonAtomicVersion {

    public static int NUMBER = 1_000_000;
    public static volatile int COUNTER = 0;

    public static void main(String[] args) {

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
     * Creates and returns a thread, which in each iteration increases the counter
     * by 1.
     * 
     * @return
     */
    private static Thread getThread() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < NUMBER; i++) {
                    COUNTER++;
                }
            }
        });

        return thread;
    }
}

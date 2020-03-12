package main.java.am.hsp.apps.oop.investigation.multithreading.atomic_operation;

import java.util.concurrent.atomic.AtomicInteger;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Now we are trying to make the incremental operation atomic by using
 * AtomicInteger. Now we're able to increment the number concurrently in a
 * thread-safe manor without synchronizing the access to the variable.
 * 
 * Now it is guaranteed the result with 2.000.000.
 * 
 * @author user
 *
 */
public class AtomicVersion2 {

    public static int NUMBER = 1_000_000;

    /*
     * Unlike the case with synchronized method, the OS cannot terminate the thread,
     * while it operates on Atomic variable.
     * 
     */
    public static AtomicInteger COUNTER = new AtomicInteger(0);

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
                    COUNTER.incrementAndGet();
                }
            }
        });

        return thread;
    }
}

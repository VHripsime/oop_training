package main.java.am.hsp.apps.oop.investigation.multithreading.interrupt_method;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Though we've interrupted the thread, it continues to execute.
 * 
 * @author hripsime
 *
 */
public class Example2 {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            public void run() {
                Thread currentThread = Thread.currentThread();
                checkInterruptionStatus(currentThread);
            }
        });

        thread.start();
        ThreadUtil.sleep(1000);
        thread.interrupt();
    }

    /**
     * Infinitely checks the given thread's interruption status.
     * 
     * @param thread
     */
    private static void checkInterruptionStatus(Thread thread) {
        while (true) {
            System.out.println(thread.isInterrupted() + ": " + thread.isAlive());
            for (int i = 0; i < 1000000000; i++)
                ;
        }
    }
}

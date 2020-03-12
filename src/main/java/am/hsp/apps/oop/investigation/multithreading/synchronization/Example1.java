package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Inside a synchronized object only one thread is allowed to execute. That's
 * why in this example the Main thread can't enter the given synchronized
 * object.
 * 
 * @author user
 *
 */
public class Example1 {

    public static void main(String[] args) {

        Object lock = new Object();
        new Thread(getRunnable(lock)).start();

        System.out.println("Main: sleep");
        ThreadUtil.sleep(1000);
        System.out.println("Main: wake up");

        // main thread will not reach here.
        synchronized (lock) {
            System.out.println("Main: in synchronized block");
        }
    }

    /**
     * Returns a Runnable object, which infinitely operates on a synchronized
     * object.
     * 
     * @param object
     * @return
     */
    private static Runnable getRunnable(Object object) {
        return new Runnable() {
            public void run() {
                System.out.println("Run: started");
                synchronized (object) {
                    System.out.println("Run: in synchronized block");
                    while (true) {
                    }
                }
            }
        };
    }
}

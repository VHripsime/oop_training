package main.java.am.hsp.apps.oop.investigation.multithreading.join_method.main_join;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * A thread class, which is designed for completing its work after the main
 * thread.
 * 
 * @author user
 *
 */
public class MyThread implements Runnable {

    public static Thread thread;

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        ThreadUtil.join(thread);
        executeLoop("child thread", 10);
    }

    /**
     * Prints the given message in the given times.
     */
    private void executeLoop(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}
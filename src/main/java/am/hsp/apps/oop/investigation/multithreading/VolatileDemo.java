package main.java.am.hsp.apps.oop.investigation.multithreading;

public class VolatileDemo {

    /*
     * Volatile keyword is used to mark a Java variable as being stored in main
     * memory. More precisely that means, that every read/write will be done in main
     * memory, and not just in the CPU cache. Though, declaring variable as volatile
     * is costly.
     * 
     */
    public static volatile boolean READY = true;
    public static int DATA = 0;

    public static void main(String[] args) {

        runFirstThread();
        runSecondThread();
    }

    /**
     * Executes the first thread.
     */
    private static void runFirstThread() {
        new Thread(new Runnable() {
            public void run() {
                ThreadUtil.sleep(1000);
                DATA = 1;

                /*
                 * If READY is volatile, this guarantees that all the values above this line
                 * will be available in RAM.
                 */
                READY = false;
            }
        }).start();
    }

    /**
     * Executes the second thread.
     */
    private static void runSecondThread() {
        new Thread(new Runnable() {
            public void run() {
                while (READY) {
                    System.out.println("value: " + DATA);
                }
            }
        }).start();
    }
}

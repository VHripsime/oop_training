package main.java.am.hsp.apps.oop.investigation.multithreading.join_method.main_join;

/**
 * Demonstrating how the given thread completes its work after the main thread.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        MyThread.thread = Thread.currentThread();

        Thread myThread = new Thread(new MyThread());
        myThread.start();

        executeMainLoop();
    }

    /**
     * A loop, which must be executed by the main thread.
     * 
     * @throws InterruptedException
     */
    private static void executeMainLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}

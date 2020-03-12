package main.java.am.hsp.apps.oop.investigation.multithreading;

/**
 * A daemon thread is a thread that does not prevent the JVM from exiting when
 * the program finishes, but the thread is still running.
 * 
 * @author user
 *
 */
public class DaemonDemo {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    System.out.println("In thread");
                }
            }
        });

        thread.setDaemon(true);
        thread.start();
        System.out.println("Exit");
    }
}

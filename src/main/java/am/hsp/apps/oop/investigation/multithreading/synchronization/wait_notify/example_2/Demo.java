package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization.wait_notify.example_2;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Demonstrating two cases:
 * 
 * 1. Main thread first got lock of the object.
 * 
 * 2. Child thread first got lock of the object.
 * 
 * In the 2nd case, we will get a problem. The program will infinitely wait,
 * until someone awakens the main thread. To get this scenario, we must comment
 * out the 26th row. But to complete the program, we have to comment out also
 * the 33th row.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();

        // ThreadUtil.sleep(2000);

        synchronized (myThread) {
            System.out.println("main is calling wait...");

            ThreadUtil.wait(myThread);
            // ThreadUtil.wait(myThread, 5000);

            System.out.println("main got a notification: " + myThread.sum);
        }
    }
}

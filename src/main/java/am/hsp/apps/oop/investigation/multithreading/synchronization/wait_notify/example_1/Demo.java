package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization.wait_notify.example_1;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Demonstrating how notify() and notifyAll() work.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        MyClass myObject = new MyClass();

        Thread t1 = new Thread(new ThreadCall(myObject), "t1");
        Thread t2 = new Thread(new ThreadCall(myObject), "t2");
        Thread t3 = new Thread(new ThreadCall(myObject), "t3");

        t1.start();
        t2.start();
        t3.start();

        ThreadUtil.sleep(1000);

        Thread t4 = new Thread(new ThreadWakening(myObject), "t4");
        t4.start(); // this will awake one of the waiting threads.
    }
}

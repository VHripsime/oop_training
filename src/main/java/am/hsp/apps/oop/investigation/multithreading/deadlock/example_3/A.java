package main.java.am.hsp.apps.oop.investigation.multithreading.deadlock.example_3;

/**
 * Contains synchronized method, which is trying to call another object's
 * synchronized method.
 * 
 * @author user
 *
 */
public class A {

    public synchronized void executeLastOfB(B b) {
        System.out.println(Thread.currentThread().getName() + " starts execution of A's d1().");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " is trying execution of B's last().");
        b.last();
    }

    /**
     * A method which can not accessed by the 2nd thread.
     */
    public synchronized void last() {
        System.out.println("Inside A's last() method.");
    }
}
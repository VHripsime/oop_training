package main.java.am.hsp.apps.oop.investigation.multithreading.deadlock.example_3;

/**
 * Contains synchronized method, which is trying to call another object's
 * synchronized method.
 * 
 * @author user
 *
 */
public class B {

    public synchronized void executeLastOfA(A a) {
        System.out.println(Thread.currentThread().getName() + " starts execution of B's d2().");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " is trying execution of A's last().");
        a.last();
    }

    public synchronized void last() {
        System.out.println("Inside B's last() method.");
    }
}
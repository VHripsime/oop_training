package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization.multiple_object_lock;

/**
 * A thread can acquire multiple objects lock. When it releases one of them, it
 * still locks the other objects monitors.
 * 
 * @author user
 *
 */
public class X {

    public synchronized void m1() {
        
        try {
            System.out.println("X type of object is locked by: " + Thread.currentThread().getName());
            Y y = new Y();

            synchronized (y) {
                System.out.println("y is locked by: " + Thread.currentThread().getName());
                Z z = new Z();

                synchronized (z) {
                    System.out.println("z is locked by: " + Thread.currentThread().getName());
                    // z.wait();
                    // y.wait();
                    this.wait();
                }
            }
        } catch (InterruptedException | IllegalMonitorStateException e) {
            System.out.println("Exception thrown by: " + Thread.currentThread().getName());
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization;

/**
 * While a thread is executing a synch method on a given object, the remaining
 * threads are not allowed to execute any synch method simultaneously on the
 * same object. But they are allowed to execute non-synch methods at the same
 * time.
 * 
 * @author user
 *
 */
public class ObjectLevelLock {

    /*
     * t1 thread executes this method. t2 thread can't execute this method of
     * the same object until t1 completes.
     */
    public synchronized void m1() {
    }

    // t2 thread can't execute this method.
    public synchronized void m2() {
    }

    // t2 is allowed to execute this one.
    public void m3() {
    }

    public static void main(String[] args) throws InterruptedException {

        /*
         * IllegalMonitorStateException, as we called wait() without
         * synchronizing by the object.
         */
        // new Object().wait();

        Object ref0 = new Object();
        Object ref1 = ref0;

        /*
         * the thread can call notify() on ref1, as it has the same monitor as
         * ref0.
         */
        synchronized (ref0) {
            ref1.notify();
        }

        // is the same as the above code.
        synchronized (ref0) {
            synchronized (ref0) {
                ref1.notify();
            }
        }

        // here we captured the monitors of ref0 and ref1 objects.
        synchronized (ref0) {
            synchronized (ref1) {
                ref1.notify();
            }
        }

        synchronized (ref1) {
            ref0.notify();
        }

        // ref1 will infinitely wait for someone to notify him.
        synchronized (ref1) {
            ref1.wait();
        }
    }

    // The following two methods are equivalent.
    public void f2() {
        synchronized (this) {
            this.notify();
        }
    }

    // We synchronized by this.
    public synchronized void f1() {
        this.notify();
    }
}

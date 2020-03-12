package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization.wait_notify.example_1;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

public class MyClass {

    /**
     * In the middle of the execution sends the thread to wait.
     */
    public synchronized void call() {
        System.out.println("Inside method: " + Thread.currentThread().getName());

        System.out.println("Going to wait: " + Thread.currentThread().getName());
        System.out.println();
        ThreadUtil.wait(this);

        System.out.println("Got up: " + Thread.currentThread().getName());
    }

    /**
     * notify() wakes up a single thread that is waiting on this object's monitor.
     * If many threads are waiting on this object, one of them is being chosen to be
     * awakened.
     */
    public synchronized void awake() {
        //this.notify();
        this.notifyAll();
    }
}

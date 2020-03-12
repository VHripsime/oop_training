package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization.multiple_object_lock;

public class MyThread implements Runnable {

    private X x;

    public MyThread(X x) {
        this.x = x;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        x.m1();
    }
}

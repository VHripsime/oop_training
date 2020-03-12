package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization.wait_notify.example_1;

/**
 * Runs a method, which is responsible to make threads to wait.
 * 
 * @author user
 *
 */
public class ThreadCall implements Runnable {

    private MyClass myObject;

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param myObject
     */
    public ThreadCall(MyClass myObject) {
        this.myObject = myObject;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    public void run() {
        myObject.call();
    }
}

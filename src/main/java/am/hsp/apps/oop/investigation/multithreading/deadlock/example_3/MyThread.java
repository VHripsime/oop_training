package main.java.am.hsp.apps.oop.investigation.multithreading.deadlock.example_3;

/**
 * Contains method, which generates a deadlock situation.
 * 
 * @author user
 *
 */
public class MyThread extends Thread {

    private A a;
    private B b;

    public MyThread() {
        this.a = new A();
        this.b = new B();
    }

    /**
     * This method causes deadlock.
     */
    public void callStart() {
        this.start();
        a.executeLastOfB(b);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Thread#run()
     */
    public void run() {
        b.executeLastOfA(a);
    }
}
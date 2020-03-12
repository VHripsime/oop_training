package main.java.am.hsp.apps.oop.investigation.multithreading.deadlock.example_3;

/**
 * Demonstrating deadlock situation.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.callStart();
    }
}

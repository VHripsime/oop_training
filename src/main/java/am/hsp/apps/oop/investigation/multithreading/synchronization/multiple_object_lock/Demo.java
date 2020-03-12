package main.java.am.hsp.apps.oop.investigation.multithreading.synchronization.multiple_object_lock;

/**
 * Demonstrating threads behavior in multiple objects' locks scenario.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        X x = new X();

        Thread t1 = new Thread(new MyThread(x), "t1");
        Thread t2 = new Thread(new MyThread(x), "t2");

        t1.start();
        t2.start();
    }
}

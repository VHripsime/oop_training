package main.java.am.hsp.apps.oop.investigation.multithreading.deadlock;

/**
 * Demonstrating a DeadLock situation in case of nested synchronized blocks.
 * 
 * @author hripsime
 *
 */
public class Example2 {

    public static void main(String[] args) {

        final String firstString = "first resource";
        final String secondString = "second resource";

        Thread firstThread = new Thread(new Runnable() {
            public void run() {
                synchronized (firstString) {
                    System.out.println(Thread.currentThread().getName() + " locked firstString's monitor");

                    synchronized (secondString) {
                        System.out.println(Thread.currentThread().getName() + " locked secondString's monitor");
                    }
                }
            }
        }, "First Thread");

        Thread secondThread = new Thread(new Runnable() {
            public void run() {
                synchronized (secondString) {
                    System.out.println(Thread.currentThread().getName() + " locked secondString's monitor");

                    synchronized (firstString) {
                        System.out.println(Thread.currentThread().getName() + " locked firstString's monitor");
                    }
                }
            }
        }, "Second Thread");

        firstThread.start();
        secondThread.start();
    }
}

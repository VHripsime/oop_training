package main.java.am.hsp.apps.oop.investigation.multithreading.deadlock;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Deadlock occurs in a situation where two or more threads are blocked forever,
 * waiting for each other.
 * 
 * @author user
 *
 */
public class Example1 {

    public static void main(String[] args) {

        Thread[] threads = new Thread[2];

        threads[0] = new Thread(new Runnable() {
            public void run() {
                try {
                    ThreadUtil.sleep(1000);
                    threads[1].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threads[1] = new Thread(new Runnable() {
            public void run() {
                try {
                    threads[0].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threads[0].start();
        threads[1].start();
    }
}

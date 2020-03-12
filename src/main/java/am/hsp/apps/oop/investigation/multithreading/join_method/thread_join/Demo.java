package main.java.am.hsp.apps.oop.investigation.multithreading.join_method.thread_join;

import main.java.am.hsp.apps.oop.investigation.multithreading.ThreadUtil;

/**
 * Demonstrating how the main thread completes its work after the given thread.
 * 
 * Java Thread join() method can be used to pause the current thread execution
 * until the specified thread is dead.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        Thread first = new Thread(new Operation("Open"));
        Thread second = new Thread(new Operation("Close"));

        first.start();
        second.start();

        // In this case "Stop" will exactly be after all "Open".
        ThreadUtil.join(first);
        System.out.println("Stop");
        ThreadUtil.join(second);

        /*
         * In this case "Stop" will exactly be after all "Close".
         */
        // second.join();
        // System.out.println("Stop");
        // first.join();
    }
}
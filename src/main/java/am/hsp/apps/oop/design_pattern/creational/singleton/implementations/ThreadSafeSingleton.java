package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.implementations;

/**
 * To create a thread-safe singleton class is to make the method synchronized,
 * so that only one thread can execute this method at a time. But it reduces the
 * performance because of the cost associated with the synchronized method.
 * 
 * @author user
 * 
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ThreadSafeSingleton();
        }
        return INSTANCE;
    }
}

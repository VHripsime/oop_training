package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.implementations;

/**
 * In lazy initialization the instance is being created in the method. But in
 * case of multithreaded systems, it can cause issues if multiple threads are
 * inside the if condition at the same time. It will destroy the singleton
 * pattern and both threads will get the different instances of the singleton
 * class.
 * 
 * @author user
 *
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

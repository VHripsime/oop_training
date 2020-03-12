package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.destruction_cases.by_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import main.java.am.hsp.apps.oop.design_pattern.creational.singleton.implementations.LazySingleton;

/**
 * Using threads simultaneously to show how different instances are being
 * created.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Destroying lazy initialization singleton:");
        destroy();
    }

    /**
     * Trying to destroy lazy initialization singleton.
     */
    private static void destroy() {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(Demo::createSingletonInstance);
        service.submit(Demo::createSingletonInstance);
        service.shutdown();
    }

    /**
     * Trying to destroy lazy singleton class.
     */
    private static void createSingletonInstance() {
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println("Object hashcode: " + instance.hashCode());
    }
}

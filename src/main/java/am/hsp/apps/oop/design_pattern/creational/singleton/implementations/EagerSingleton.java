package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.implementations;

/**
 * In eager initialization, the instance of Singleton Class is created at the
 * time of class loading. This is the easiest method to create a singleton
 * class, but it has a drawback that instance is created even though client
 * application might not be using it.
 * 
 * @author user
 *
 */
public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}

package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.implementations;

/**
 * Bill Pugh approach creates the Singleton class using an inner static helper
 * class, which contains the instance of the singleton class. When the singleton
 * class is loaded, SingletonHelper class is not loaded into memory and only
 * when someone calls the getInstance method, this class gets loaded and creates
 * the Singleton class instance.
 * 
 * @author user
 *
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

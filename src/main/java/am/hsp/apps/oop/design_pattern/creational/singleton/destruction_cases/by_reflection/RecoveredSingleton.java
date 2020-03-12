package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.destruction_cases.by_reflection;

/**
 * To prevent the 2nd instance creation by reflection, we throw an exception in
 * the constructor.
 * 
 * @author user
 *
 */
public class RecoveredSingleton {

    private RecoveredSingleton() {
        if (SingletonHelper.INSTANCE != null) {
            throw new RuntimeException("Cannot create the 2nd instance");
        }
    }

    private static class SingletonHelper {
        private static final RecoveredSingleton INSTANCE = new RecoveredSingleton();
    }

    public static RecoveredSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

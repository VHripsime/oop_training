package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.destruction_cases.by_cloning;

/**
 * As it is possible to break the singleton pattern by making the class
 * cloneable, we can prevent this by throwing an exception in the clone()
 * method.
 * 
 * @author user
 *
 */
public class RecoveredCloneableSingleton implements Cloneable {

    private RecoveredCloneableSingleton() {
    }

    private static class SingletonHelper {
        private static final RecoveredCloneableSingleton INSTANCE = new RecoveredCloneableSingleton();
    }

    public static RecoveredCloneableSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new RuntimeException("Cannot make another copy.");
    }
}
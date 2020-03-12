package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.destruction_cases.by_cloning;

/**
 * It is possible to break the singleton pattern by making the class cloneable,
 * as calling the clone() method it returns a new instance.
 * 
 * @author user
 *
 */
public class CloneableSingleton implements Cloneable {

    private CloneableSingleton() {
    }

    private static class SingletonHelper {
        private static final CloneableSingleton INSTANCE = new CloneableSingleton();
    }

    public static CloneableSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

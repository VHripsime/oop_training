package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.implementations;

/**
 * To avoid the cost associated with the synchronized method, double checked
 * locking principle is used. In this approach, the synchronized block is used
 * inside the if condition with an additional check to ensure that only one
 * instance of a singleton class is created.
 * 
 * @author user
 *
 */
public class DoubleCheckedLockingSingleton {

    private static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return instance;
    }
}

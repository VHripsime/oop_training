package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.destruction_cases.by_cloning;

/**
 * Destroying the singleton pattern by cloning the class and trying to do the
 * same after recovering the issue.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("Creating a new instance by the clone() method:");
        destroy();

        System.out.println("\nPreventing a new instance creation by the clone() method:");
        destroyAfterRecovery();
    }

    /**
     * Shows, that the clone() method of the cloneable singleton class returns a new
     * instance.
     * 
     * @throws CloneNotSupportedException
     */
    private static void destroy() throws CloneNotSupportedException {
        CloneableSingleton instanceOne = CloneableSingleton.getInstance();
        CloneableSingleton instanceTwo = (CloneableSingleton) instanceOne.clone();

        System.out.println("Hashcode of the singleton class object: " + instanceOne.hashCode());
        System.out.println("Hashcode of the cloned singleton object: " + instanceTwo.hashCode());
    }

    /**
     * Shows, that the clone() method does not allowed to create a new instance of
     * singleton class object.
     * 
     * @throws CloneNotSupportedException
     */
    private static void destroyAfterRecovery() throws CloneNotSupportedException {
        RecoveredCloneableSingleton instanceOne = RecoveredCloneableSingleton.getInstance();
        RecoveredCloneableSingleton instanceTwo = (RecoveredCloneableSingleton) instanceOne.clone();

        System.out.println("Hashcode of the singleton class object: " + instanceOne.hashCode());
        System.out.println("Hashcode of the cloned singleton object: " + instanceTwo.hashCode());
    }
}
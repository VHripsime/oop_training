package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.destruction_cases.by_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import main.java.am.hsp.apps.oop.design_pattern.creational.singleton.implementations.BillPughSingleton;

/**
 * Destroying the singleton pattern by reflection and trying to do the same
 * after recovering the issue.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println("Destroying the singleton pattern by reflection:");
        destroy();

        System.out.println("\nTrying to destroying the singleton pattern after recovery:");
        destroyAfterRecovery();
    }

    /**
     * Shows how reflection destroy the singleton pattern.
     */
    private static void destroy() {
        BillPughSingleton instanceOne = BillPughSingleton.getInstance();
        BillPughSingleton instanceTwo = getInstanceByReflection();

        System.out.println("Instance hashcode created by the singleton class: " + instanceOne.hashCode());
        System.out.println("Instance hashcode created by the reflection: " + instanceTwo.hashCode());
    }

    private static void destroyAfterRecovery() {
        RecoveredSingleton instanceOne = RecoveredSingleton.getInstance();
        RecoveredSingleton instanceTwo = getInstanceAfterRecovery();

        System.out.println("Instance hashcode created by the singleton class: " + instanceOne.hashCode());
        System.out.println("Instance hashcode created by the reflection: " + instanceTwo.hashCode());

    }

    /**
     * Creating the 2nd instance of a singleton class.
     * 
     * @return
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    private static BillPughSingleton getInstanceByReflection() {
        BillPughSingleton instance = null;

        try {
            Constructor<?> constructor = BillPughSingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instance = (BillPughSingleton) constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException
                | InvocationTargetException e) {
            System.out.println("Failed!");
        }

        return instance;
    }

    /**
     * Trying to creating the 2nd instance of the singleton class after the
     * recovery.
     * 
     * @return
     */
    private static RecoveredSingleton getInstanceAfterRecovery() {
        RecoveredSingleton instance = null;

        try {
            Constructor<?> constructor = RecoveredSingleton.class.getConstructor();
            constructor.setAccessible(true);
            instance = (RecoveredSingleton) constructor.newInstance();
        } catch (Exception e) {
            System.out.println("Failed!");
        }

        return instance;
    }
}
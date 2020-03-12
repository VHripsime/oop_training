package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.implementations;

/**
 * To overcome the situation with Reflection, we can use Enum to implement the
 * Singleton design pattern, as Java ensures that any enum value is instantiated
 * only once in a Java program. The drawback is that the enum type is somewhat
 * inflexible; for example, it does not allow lazy initialization.
 * 
 * @author user
 *
 */
public enum EnumSingleton {

    INSTANCE;
}

package main.java.am.hsp.apps.oop.design_pattern.creational.singleton.implementations;

/**
 * In static block initialization the instance of class is created in the static
 * block, which provides option for exception handling. Both eager
 * initialization and static block initialization creates the instance even
 * before it�s being used and that is not the best practice to use.
 * 
 * @author user
 *
 */
public class StaticBlockSingleton {

    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {
    }

    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}

package main.java.am.hsp.apps.oop.design_pattern.creational.prototype;

/**
 * Utility class containing a method for getting a copy of the Animal type
 * object.
 * 
 * @author hripsime
 *
 */
public final class CloneFactory {

    /**
     * Private constructor for not allowing to create an instance of this class.
     */
    private CloneFactory() {
    }

    /**
     * Returns the cloned object of the given animal.
     * 
     * @param animalType
     * @return
     * @throws CloneNotSupportedException 
     */
    public static Animal getCopy(Animal animalType) throws CloneNotSupportedException {
        return animalType.makeCopy();
    }
}

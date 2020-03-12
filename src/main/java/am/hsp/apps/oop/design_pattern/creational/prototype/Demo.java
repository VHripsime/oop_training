package main.java.am.hsp.apps.oop.design_pattern.creational.prototype;

/**
 * Prototype design pattern demonstration.
 * 
 * @author hripsime
 *
 */
public class Demo {

    public static void main(String[] args) {

        Cow cow = new Cow("Daisy", 500);
        Sheep sheep = new Sheep("Shelly", 90);

        Cow clonedCow = null;
        Sheep clonedSheep = null;

        try {
            clonedCow = (Cow) CloneFactory.getCopy(cow);
            clonedSheep = (Sheep) CloneFactory.getCopy(sheep);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("The cow object's description:");
        System.out.println(cow);
        System.out.println("\nA separate object has been created for the cloned cow reference:");
        System.out.println(clonedCow);

        System.out.println();

        System.out.println("The sheep object's description:");
        System.out.println(sheep);
        System.out.println("\nA separate object has been created for the cloned sheep reference:");
        System.out.println(clonedSheep);
    }
}

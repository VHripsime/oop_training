package main.java.am.hsp.apps.oop.investigation.enums;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EnumInTreeSet {
   
    public static void main(String[] args) {
        Set<Fruit> fruits = new TreeSet<Fruit>();

        fruits.add(Fruit.Apple);
        fruits.add(Fruit.Grape);
        fruits.add(Fruit.Pinapple);

        System.out.println("Prints the fruits in order they appear in the enum class.");
        
        Iterator<Fruit> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // for (Fruit fruit : fruits) {
        // System.out.println(fruit);
        // }
    }
}

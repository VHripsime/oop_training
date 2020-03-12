package main.java.am.hsp.apps.oop.investigation.enums;

public class TestingEnumMethods {

    public static void main(String[] args) {
    	
    	System.out.println("Testing the equals method for watermellon and apple: ");
        System.out.println(Fruit.Watermellon.equals(Fruit.Apple));

        System.out.println("\nGetting enum equivalent of the given String: ");
        testValueOf("Grape");

        System.out.println("Printing the enums: ");
        print();

        System.out.println("Calling the getEnumConstants() method: ");
        printEnumConstants();

        System.out.println("Getting the indexes: ");
        testOrdinal();

        System.out.println("Setting the watermellon color to green: ");
        Fruit.Watermellon.setColor("green");
        System.out.println(Fruit.Watermellon.getColor());

        System.out.println("Checking the Pinapple color after setting color to green: ");
        System.out.println(Fruit.Pinapple.getColor());

        System.out.println("\ncompareTo() method compares this enum with the specified object for order: ");
        System.out.println(Fruit.Apple.compareTo(Fruit.Grape));
    }

    private static void testValueOf(String name) {
        Fruit grape = Fruit.valueOf(name);
        System.out.println(grape);

        // The upper-lower cases make sense...
        // Fruit apple = Fruit.valueOf("apple");
        // System.out.println(apple); => IllegalArgumentException

        System.out.println();
    }

    private static void print() {
        Fruit[] fruits = Fruit.values();
        for (Fruit f : fruits) {
            System.out.println(f);
        }

        System.out.println();

        for (int i = 0; i < Fruit.values().length; i++) {
            System.out.println(fruits[i]);
        }

        System.out.println();
    }

    private static void printEnumConstants() {
        Class<Fruit> c = Fruit.class;

        for (Fruit fruit : c.getEnumConstants()) {
            System.out.println(fruit.name());
        }

        System.out.println();
    }

    private static void testOrdinal() {
        Fruit[] fruits = Fruit.values();
        for (Fruit fruit : fruits) {
            System.out.println(fruit + " " + fruit.ordinal());
        }

        System.out.println();
    }
}

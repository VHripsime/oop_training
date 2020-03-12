package main.java.am.hsp.apps.oop.data_structures.list.array_list;

import main.java.am.hsp.apps.oop.data_structures.list.MyList;

/**
 * Demonstrating the methods of the MyArrayList class.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {
        MyList array = new MyArrayList();

        array.add("winter");
        array.add("spring");
        array.add("summer");
        array.add("autumn");

        System.out.println("Number of elements: " + array.getSize());
        System.out.println(array);

        array.add(1, "2018");

        System.out.println();
        System.out.println("Number of elements after adding 1 element: " + array.getSize());
        System.out.println(array);

        array.remove(3);

        System.out.println();
        System.out.println("Number of elements after deleting the 4th element: " + array.getSize());
        System.out.println(array);

        System.out.println();
        System.out.println("Checking whether contains winter: " + array.contains("winter"));

        array.set(1, "summer");

        System.out.println("\nAfter replacing 2018 with summer: " + array);
        System.out.println("\nGetting the 3rd element: " + array.get(2));

        System.out.println("\nIs array empty?: " + array.isEmpty());
        System.out.println("Our array is: " + array);

        array.removeAll();

        System.out.println("\nAfter removing all the elements: ");
        System.out.println("Elements count: " + array.getSize());
        System.out.println("The array is: " + array);
        System.out.println("Is array empty?: " + array.isEmpty());

        System.out.println("\nChecking the dynamically enlarging capability...");

        for (int i = 0; i < 20; i++) {
            array.add((new Integer(i)).toString());
        }

        System.out.println(array);
    }
}

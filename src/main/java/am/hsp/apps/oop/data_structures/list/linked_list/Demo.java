package main.java.am.hsp.apps.oop.data_structures.list.linked_list;

import main.java.am.hsp.apps.oop.data_structures.list.MyList;

/**
 * Demonstrating MyLinkedList data structure.
 * 
 * @author hripsime
 *
 */
public class Demo {

    public static void main(String[] args) {

        MyList list = new MyLinkedList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println("The list is: " + list);
        System.out.println("The size is: " + list.getSize());

        list.add(5, "d");
        System.out.println("\nAdding 'd' at 5th index : " + list);
        System.out.println("The size is: " + list.getSize());

        System.out.println("\nThe 3rd element is: " + list.get(2));

        System.out.println("\nDoes contain 'f'?: " + list.contains("f"));

        list.set(4, "E");
        System.out.println("\nReplacing the 5th element with 'E': " + list);

        list.remove(1);
        System.out.println("\nRemoving the 2nd element: " + list);

        list.add(2, "d");
        System.out.println("\nAdding 'd' at the 2nd index: " + list);

        list.remove("d");
        System.out.println("\nRemoving elements equal to 'd': " + list);

        list.removeAll();
        System.out.println("\nRemoving all the elements: " + list);
    }

}

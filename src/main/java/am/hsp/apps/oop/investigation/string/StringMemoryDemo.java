package main.java.am.hsp.apps.oop.investigation.string;

/**
 * Whenever we create a string object using string literal, that object is
 * stored in the string constant pool and whenever we create a string object
 * using new keyword, such object is stored in the heap memory.
 * 
 * @author user
 *
 */
public class StringMemoryDemo {

    public static void main(String[] args) {

        /*
         * Once we've created a String object, we can't perform any changes on
         * it.
         */
        String firstString = new String("book");
        String secondString = new String("book");
        /*
         * If we are trying to perform any changes, with those changes a new
         * object will be created.
         */
        firstString.concat("case");
        System.out.println(firstString);
        System.out.println(
                firstString == secondString); /* reference comparison */
        System.out.println(
                firstString.equals(secondString)); /* content comparison */
        System.out.println();

        /*
         * In this case two objects will be created: one in heap, and one in
         * String Constant Pool(SCP). thirdString refers the one in heap.
         */
        String thirdString = new String("board");
        /*
         * In this case no new object will be created in SCP, as there is
         * already the one with "white" content.
         */
        String fourthString = "board";
        // fifthString refers to the object in SCP.
        String fifthString = "board";
        // fourthString and fifthString refer to the same object:
        System.out.println(fourthString == fifthString); // -> true
        System.out.println(fourthString.equals(fifthString)); // -> true
        System.out.println();

        String season = new String("summer");
        /*
         * concat() is a runtime operation. When an object is created at
         * runtime, it will be kept at heap area. The new object in heap is with
         * "summer holidays" content. Also one object will be created in SCP
         * with " holidays" content.
         */
        season.concat(" holidays");

        String color = new String("yellow");
        /*
         * At the time of runtime operation, if there is a change in the
         * content, then with those changes a new object will be created in
         * heap. Whether the object present in heap or SCP, the rule is same.
         */
        String uppercaseColor = color.toUpperCase();
        /*
         * At the time of runtime operation, if there is no change in the
         * content, then the existing object will be reused, and a new object
         * won't be created. Whether the object present in heap or SCP, the rule
         * is same.
         */
        String lowercaseColor = color.toLowerCase();
        System.out.println(color == lowercaseColor); // -> true
        System.out.println();

        String tree = "oak";
        String secondTree = tree.toString();
        System.out.println(tree == secondTree); // -> true
        String thirdTree = tree.toLowerCase();
        String fourthTree = tree.toUpperCase();
        System.out.println(thirdTree == tree); // -> true
        String fifthTree = fourthTree.toUpperCase();
        System.out.println(fifthTree == fourthTree); // -> true
        System.out.println();

        String food = "bread";
        /*
         * intern() returns a string that has the same contents as food string,
         * but is guaranteed to be from a pool of unique strings.
         */
        String secondFood = food.intern();
        String thirdFood = new String("bread");
        // It creates exact copy of heap string object in string constant pool.
        String fourthFood = thirdFood.intern();
        System.out.println(food == secondFood); // -> true
        System.out.println(food == thirdFood); // -> false
        System.out.println(food == fourthFood); // -> true
        System.out.println(secondFood == thirdFood); // -> false
        System.out.println(secondFood == fourthFood); // -> true
        System.out.println(thirdFood == fourthFood); // -> false
    }
}

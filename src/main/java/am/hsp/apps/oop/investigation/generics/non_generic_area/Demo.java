package main.java.am.hsp.apps.oop.investigation.generics.non_generic_area;

import java.util.ArrayList;
import java.util.List;

/**
 * If we send a generic object to a non-generic area, then it'll start to behave
 * like a non-generic object. Similarly, If we send a non-generic object to a
 * generic area, then it'll start to behave like a generic object.
 * 
 * @author user
 *
 */
public class Demo {

    /**
     * Generic area!
     * 
     * @param args
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("winter");
        list.add("spring");

        // we can't add 10 to the list!
        // list.add(10);

        System.out.println("Sending the generic list object to the non-generic method:");
        addElements(list);

        // Now we can see that list contains not only String types.
        System.out.println(list);
    }

    /**
     * Non-generic area!
     * 
     * @param list
     */
    private static void addElements(List list) {
        list.add(10);
        list.add(10.5);
        list.add(true);
    }
}

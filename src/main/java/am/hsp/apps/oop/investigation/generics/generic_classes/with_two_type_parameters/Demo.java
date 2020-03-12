package main.java.am.hsp.apps.oop.investigation.generics.generic_classes.with_two_type_parameters;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        printInfo("45-LK-R4", 4659);
        printInfo(4568, "LKPass");
        printInfo(98.75, 75f);

        /*
         * We can also substitute a type parameter(i.e. V) with a parameterized
         * type(i.e. List<String>):
         */
        List<String> list = new ArrayList<String>();
        list.add("shoes");
        list.add("bags");
        list.add("shirts");

        printInfo("orders", list);

    }

    /**
     * Prints the information about the given inputs.
     * 
     * @param firstType
     * @param secondType
     */
    private static <T, V> void printInfo(T firstType, V secondType) {
        Information<T, V> info = new Information<T, V>(firstType, secondType);

        System.out.println("The id is: " + info.getId());
        System.out.println("The password is: " + info.getPassword());

        info.showTypes();
        System.out.println();
    }
}
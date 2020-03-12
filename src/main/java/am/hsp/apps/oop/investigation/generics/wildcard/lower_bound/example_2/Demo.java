package main.java.am.hsp.apps.oop.investigation.generics.wildcard.lower_bound.example_2;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(new Object());

        addGift(list);
        System.out.println(list);
    }

    /**
     * EXPLANATION!!!
     * 
     * So when using wildcards it means that the method parameter can be passed
     * in several types, and the code inside the method MUST BE VALID for all
     * the cases!
     * 
     * So for current example, List<? super Gift> list parameter can be: 1. List
     * <Gift> 2. List<Object>
     * 
     * So for the point 2, the below code is absolutely valid! BUT for the point
     * 1 it is INVALID - as Object can not be represented as Gift object (Gift g
     * = new Object() - Invalid OOP concept)!!!
     * 
     * @param list
     */
    public static void addGift(List<? super Gift> list) {
        list.add(new Book());
        list.add(new Phone());
        // list.add(new Object()); // row 3: won't compile
    }
}
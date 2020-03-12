package main.java.am.hsp.apps.oop.investigation.generics.wildcard.upper_bound.example_2;

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
     * So when using wildcards it means that the method parameter can be passed
     * in several types, and the code inside the method MUST BE VALID for all
     * the cases!
     * 
     * So for current example, List<? extends Gift> list, it is possible that
     * the method will get following types of the list: 1. List<Gift> 2. List
     * <Phone> 3. List<Book>
     * 
     * So that means that ALL the rows in our method will not compile, because:
     * row 1: list.add(new Book()) -> this will not compile because of point 2
     * row 2: list.add(new Phone()) -> this will not compile because of point 3
     * row 3: list.add(new Object()) -> this is not valid for all the points
     * 
     * @param list
     */
    public static void addGift(List<? extends Gift> list) {
       // list.add(new Book()); // row 1: won't compile (When "extends" used) 
       // list.add(new Phone()); // row 2: won't compile (When "extends" used) 
       // list.add(new Object()); // row 3: won't compile 
    }
}
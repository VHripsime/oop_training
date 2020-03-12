package main.java.am.hsp.apps.oop.investigation.generics.wildcard.lower_bound.example_1;

import java.util.List;

/**
 * Contains a method, which uses wildcard argument in List having a lower bound.
 * 
 * @author user
 *
 */
public class Test {

    public static void show(List<? super B> list) {
        System.out.println("Accepted!");
    }

}

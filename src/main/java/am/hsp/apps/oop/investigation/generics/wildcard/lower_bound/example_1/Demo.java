package main.java.am.hsp.apps.oop.investigation.generics.wildcard.lower_bound.example_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrating which types are acceptable for the Test class method.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        // List<C> listC = new ArrayList<>();
        // Test.show(listC);

        List<B> listB = new ArrayList<>();
        Test.show(listB);

        List<A> listA = new ArrayList<>();
        Test.show(listA);

        List<Object> listO = new ArrayList<>();
        Test.show(listO);
    }
}

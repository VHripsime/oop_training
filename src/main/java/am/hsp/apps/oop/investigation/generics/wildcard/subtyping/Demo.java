package main.java.am.hsp.apps.oop.investigation.generics.wildcard.subtyping;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        /*
         * Although Integer is a subtype of Number, List<Integer> is not a
         * subtype of List<Number> and, in fact, these two types are not
         * related.
         */
        List<Integer> intList = new ArrayList<>();
        // List<Number> numList = intList;

        /*
         * In order to create a relationship between these classes, use an upper
         * bounded wildcard: List<? extends Integer> is a subtype of List<?
         * extends Number>
         */
        List<? extends Integer> integerList = new ArrayList<>();
        List<? extends Number> subNumList = intList;

        // List<? super Number> is a subtype of List<? super Integer>.
        List<? super Number> superNumList = new ArrayList<>();
        List<? super Integer> superIntList = superNumList;

        List<?> list = superIntList;
        list = superIntList;

        // List<Number> is a subtype of List<? extends Number>.
        List<Number> numberList = new ArrayList<>();
        subNumList = numberList;

        // List<Integer> is a subtype of List<? super Integer>.
        superIntList = intList;
    }
}

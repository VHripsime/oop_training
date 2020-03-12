package main.java.am.hsp.apps.oop.investigation.generics.generic_interfaces;

public class Demo {

    public static void main(String[] args) {

        Integer[] intElements = { 3, 6, 2, 8, 6 };
        Character[] charElements = { 'b', 'r', 'p', 'w' };

        MyClass<Integer> intObject = new MyClass<Integer>(intElements);
        MyClass<Character> charObject = new MyClass<Character>(charElements);

        System.out.println("Max value in intElements: " + intObject.max());
        System.out.println("Min value in intElements: " + intObject.min());
        System.out.println("Max value in charElements: " + charObject.max());
        System.out.println("Min value in charElements: " + charObject.min());
    }
}

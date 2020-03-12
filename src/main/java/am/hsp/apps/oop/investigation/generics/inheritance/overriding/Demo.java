package main.java.am.hsp.apps.oop.investigation.generics.inheritance.overriding;

public class Demo {

    public static void main(String[] args) {

        A<Integer> integerA = new A<Integer>(88);
        B<Integer> integerB = new B<Integer>(99);
        B<String> stringB = new B<String>("Generics Test");

        System.out.println(integerA.getObject());
        System.out.println(integerB.getObject());
        System.out.println(stringB.getObject());
    }

}

package main.java.am.hsp.apps.oop.investigation.generics.inheritance.generic_superclass;

public class Demo {

    public static void main(String[] args) {

        B<String, Integer> b = new B<String, Integer>("Value is: ", 99);

        System.out.print(b.getObjectOfTypeT());
        System.out.println(b.getObjectOfTypeV());
    }
}

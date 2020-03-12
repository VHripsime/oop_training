package main.java.am.hsp.apps.oop.investigation.generics.inheritance.generic_subclass;

public class Demo {

    public static void main(String[] args) {

        B<String> b = new B<String>("Value of subclass instance: ", 9);

        System.out.print(b.getObject());
        System.out.println(b.getNumber());
    }
}

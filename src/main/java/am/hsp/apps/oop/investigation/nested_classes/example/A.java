package main.java.am.hsp.apps.oop.investigation.nested_classes.example;

public class A {

    public static String s;

    public A() {
        System.out.println("Outer constructor");
    }

    public static class B {

        public B() {
            System.out.println("Inner constructor");
            s = "nested";
        }
    }

    public class C {

        public C() {
            System.out.println("Inner constructor C");
            s = "inner";
        }
    }
}

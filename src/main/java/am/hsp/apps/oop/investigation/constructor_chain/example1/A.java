package main.java.am.hsp.apps.oop.investigation.constructor_chain.example1;

public class A {

    public A() {
        this(10);
        System.out.println("Default constructor");

        this.test();
    }

    public A(int n) {
        System.out.println("Constructor with param");
    }

    public void test() {
        System.out.println("Test method");
    }
}

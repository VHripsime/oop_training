package main.java.am.hsp.apps.oop.investigation.constructor_chain.example1;

public class B extends A {

    public B() {      
        System.out.println("Creating B instance");
        test();
    }

    public void test() {
        System.out.println("Test method invoked In B");
    }
}

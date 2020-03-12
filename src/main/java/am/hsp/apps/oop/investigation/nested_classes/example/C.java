package main.java.am.hsp.apps.oop.investigation.nested_classes.example;

import main.java.am.hsp.apps.oop.investigation.nested_classes.example.A.B;

public class C extends B {

    A a = new A();

    public void method() {
        System.out.println(a.s);
    }

    public static void main(String[] args) {
        C c = new C();
        c.method();
    }
}

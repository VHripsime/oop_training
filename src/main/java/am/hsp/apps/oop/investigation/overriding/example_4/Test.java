package main.java.am.hsp.apps.oop.investigation.overriding.example_4;

public class Test {

    public static void main(String[] args) {
       A a = new B();
       
       System.out.println(a.info);
       a.print1();
       a.print2();
    }
}

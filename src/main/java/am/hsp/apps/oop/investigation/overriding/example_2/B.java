package main.java.am.hsp.apps.oop.investigation.overriding.example_2;

/**
 * Static methhods can not be overridden, they can be only hidden.
 * 
 * @author user
 *
 */
public class B extends A {

    static int x = 7;

    public static int getNumber() {
        System.out.println("In child class");
        return x;
    }

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.getNumber());
    }
}

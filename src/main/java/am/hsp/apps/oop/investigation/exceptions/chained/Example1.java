package main.java.am.hsp.apps.oop.investigation.exceptions.chained;

/**
 * Exception thrown from A() method is caught by method D().
 * 
 * @author user
 *
 */
public class Example1 {

    public static void main(String[] args) {
        E();
    }

    public static void A() {
        System.out.println("In method A()");
        System.out.println(5 / 0);
    }

    public static void B() {
        System.out.println("In method B()");
        A();
    }

    public static void C() {
        System.out.println("In method C()");
        B();
    }

    public static void D() {
        System.out.println("In method D()");
        try {
            C();
        } catch (Exception e) {
            System.out.println("Exception handled in D().");
        }
    }

    public static void E() {
        System.out.println("In method E()");
        D();
    }
}

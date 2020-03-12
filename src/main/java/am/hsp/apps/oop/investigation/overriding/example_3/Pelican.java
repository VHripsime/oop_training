package main.java.am.hsp.apps.oop.investigation.overriding.example_3;

/**
 * In this case, we are getting a CE, as we have not overridden the fly()
 * method, thus the parent referece is trying to call its fly() method, which is
 * private.
 * 
 * @author user
 *
 */
public class Pelican extends Bird {

    protected void fly() {
        System.out.println("Pelican");
    }

    public static void print() {
        System.out.println("Pelican");
    }

    public static void main(String[] args) {
        Bird b = new Pelican();

        // b.fly();
    }
}

package main.java.am.hsp.apps.oop.investigation.interfaces.default_methods;

/**
 * If we have not overridden move() method, we will get a CE, as we would have
 * duplicated methods.
 * 
 * @author user
 *
 */
public class C implements A, B {

    public static void main(String[] args) {
        C c = new C();
        c.move();
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        A.super.move();
    }
}

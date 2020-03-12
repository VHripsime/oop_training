package main.java.am.hsp.apps.oop.investigation.generics.inheritance.generic_subclass;

/**
 * It is perfectly acceptable for a non-generic class to be the superclass of a
 * generic subclass.
 * 
 * @author hripsime
 *
 */
public class A {

    private int number;

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param i
     */
    public A(int i) {
        this.number = i;
    }

    /**
     * Returns the number.
     * 
     * @return
     */
    public int getNumber() {
        return this.number;
    }
}

package main.java.am.hsp.apps.oop.investigation.serialization.inheritance_case.case_2.exception_case;

/**
 * We are observing the case, when the superclass does not implement
 * Serializable, but the subclass does. During instance control flow JVM calls
 * the no-arg constructor. If it is not available we'll get a RE:
 * InvalidClassException. It will be thrown when the code reaches to the
 * deserialization part.
 * 
 * @author user
 *
 */
public class A {

    public int i = 3;
  
    public A(int i) {
        this.i = i;
    }
}

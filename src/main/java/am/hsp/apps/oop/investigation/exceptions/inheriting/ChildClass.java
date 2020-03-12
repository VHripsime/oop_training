package main.java.am.hsp.apps.oop.investigation.exceptions.inheriting;

import java.io.FileNotFoundException;
import java.util.zip.ZipException;

public class ChildClass extends SuperClass {

    /**
     * We can add as many Runtime exceptions as we want on the overridden method.
     */
    public void m1() throws RuntimeException, Error {
        System.out.println("In m3() method");
    }

    /**
     * We can replace the IOException with its subclasses.
     */
    public void m2() throws FileNotFoundException, ZipException {
        System.out.println("In m2() method");
    }

    /**
     * We can also remove all declared exceptions.
     */
    public void m3() {
        System.out.println("In m2() method");
    }
}

package main.java.am.hsp.apps.oop.investigation.annotations.target;

import main.java.am.hsp.apps.oop.investigation.annotations.Mark;

/**
 * Annotating all the elements in this class. @CustomerAnnotation target
 * specifies the places it allowed to annotated.
 * 
 * @author user
 *
 */
@CustomerAnnotation
public class Customer {

    @CustomerAnnotation
    String name;
    int birthYear;

    @CustomerAnnotation
    public Customer(String name, int year) {
        this.name = name;
        this.birthYear = year;
    }

    public int getNumber(@CustomerAnnotation int i, @CustomerAnnotation Mark m) {
        @CustomerAnnotation
        int j = i * 2;

        return (j + birthYear);
    }

    @CustomerAnnotation
    public String toString() {
        return this.name + this.birthYear;
    }
}
package main.java.am.hsp.apps.oop.investigation.serialization.inheritance_case.case_1;

/**
 * Even though child class does not implement Serializable, we can serialize
 * child class object, if parent class implements Serializable interface.
 * 
 * @author user
 *
 */
public class B extends A {

    private static final long serialVersionUID = 5602955474876996091L;

    public int j = 20;
}

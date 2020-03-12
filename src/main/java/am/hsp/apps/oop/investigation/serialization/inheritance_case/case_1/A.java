package main.java.am.hsp.apps.oop.investigation.serialization.inheritance_case.case_1;

import java.io.Serializable;

/**
 * We are observing the case, when the superclass implements Serializable, but
 * the subclass does not.
 * 
 * @author user
 *
 */
public class A implements Serializable {

    private static final long serialVersionUID = 7073611026620918591L;

    public int i = 10;
}

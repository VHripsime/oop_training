package main.java.am.hsp.apps.oop.investigation.serialization.inheritance_case.case_2;

import java.io.Serializable;

/**
 * Even though superclass does not implement Serializable, we can serialize the
 * child class object.
 * 
 * @author user
 *
 */
public class B extends A implements Serializable {
    
    private static final long serialVersionUID = -3883691281142933304L;

    public int j = 20;  
}

package main.java.am.hsp.apps.oop.investigation.interfaces.nested;

import main.java.am.hsp.apps.oop.investigation.interfaces.nested.A.I;

/**
 * From the results 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {

        B obj = new B();
        obj.type();
        
        String s = I.k();
        System.out.println(s);
    }

}

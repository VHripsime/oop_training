package main.java.am.hsp.apps.oop.investigation.generics.erasure;

import java.util.List;

/**
 * Another example about the generic arguments after compilation.
 * 
 * @author user
 *
 */
public class Example2 {

    public void myMethod(List<String> list) {
        System.out.println("String argument");
    }

    /*
     * These two methods have the same signature after the compilation:
     * myMethod(List list). Thus they cannot be assumed as overloaded methods.
     */
    // public void myMethod(List<Integer> list){
    // System.out.println("Integer argument");
    // }
}

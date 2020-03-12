package main.java.am.hsp.apps.oop.investigation.interfaces.nested;

public class B extends A {

    public int b = m(7);
    public int c = A.I.m;   
    public String s = A.I.getInfo();
    
    public void type() {
        System.out.println(s);        
    }

}

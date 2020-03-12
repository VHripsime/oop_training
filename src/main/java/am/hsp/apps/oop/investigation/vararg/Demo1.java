package main.java.am.hsp.apps.oop.investigation.vararg;

public class Demo1 {
    
    public static void m(int ...x){
        System.out.println(x.length);
    }

    public static void main(String[] args) {
        m();
        m(new int[]{10});
        m(5,6);
    }

}

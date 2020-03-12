package main.java.am.hsp.apps.oop.investigation.vararg;

public class Demo2 {

    public static void m(int[] x, int... y) {
        System.out.println(x.length + y.length);
    }

    public static void main(String args) {
     //   m();
        m(new int[] { 5, 6 }, 5, 6);
    }
}

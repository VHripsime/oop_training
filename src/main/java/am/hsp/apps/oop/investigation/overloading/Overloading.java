package main.java.am.hsp.apps.oop.investigation.overloading;

public class Overloading {

    public static int getResult(short s, int i) {
        return s * i;
    }

    public static int getResult(int i, short s) {
        return i + s;
    }
    
    public static void main(String[] args) {
     //   System.out.println(getResult(7,1));
    }
}

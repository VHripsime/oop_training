package main.java.am.hsp.apps.oop.investigation.basics.literals;

public class ComparingDiffTypes {

    public static void main(String[] args) {
        float f1 = 0.3f;
        double d1 = 0.3;
        double d2 = 0.3f;
        double d3 = 0.5f - 0.2;

        System.out.println(f1 == 0.3);
        System.out.println(f1 == 0.3f);
        System.out.println(f1 == d1);
        System.out.println(f1 == d2);
        System.out.println(f1 == d3);

        // short b = 5;
        // int i = (byte) 5;
        // System.out.println(i == b);
    }
}

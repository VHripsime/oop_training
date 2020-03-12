package main.java.am.hsp.apps.oop.investigation.basics.literals;

public class PrimitiveTypes {

    public static void main(String[] args) {

        test1();

        // test2();

        // test3();

        // float r = 20;
        // int k = (int) r;

        // int i = 010;
        // System.out.println(i);

        // long i2 = 4;
        // // int i3 = i2;
        // float f = i2;

        // char c = 'c';
        // int v = c;
        // c = (char) v;

        // int big = (int) 1_234_567_890_000f;
        // float approx = big;
        // System.out.println(big - (int) approx);

        // char b = 7;
        // short s = (short) b;

        // char a = 97;
        // System.out.println(a);

        // final int s1 = 150;
        // short s2 = s1;
        // System.out.println(s2);

        // byte b1 = 1;
        // char c1 = (char) b1;

        // char c2 = 'b';
        // byte b2 = (byte) c2;

        // final int fin = 103;
        // byte by = fin;
        // System.out.println(by);
    }

    public static void test1() {
        char x = 'd';
        char y = '9';
        char z = (char) (x - y);
        System.out.println(z);
    }

    public static void test2() {
        double d = 130.45;
        byte b = (byte) d;

        System.out.println(b);

    }

    public static void test3() {
        long d = 200;
        float b = 15.5f;

        System.out.println(d + b);
    }
}
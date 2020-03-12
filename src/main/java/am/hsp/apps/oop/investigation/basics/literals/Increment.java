package main.java.am.hsp.apps.oop.investigation.basics.literals;

public class Increment {

    public static void main(String[] args) {
        int a = 10, b = 10;

        for (int i = 0; i < 5; i++) {
            if (++a > 2 || ++b > 2) {
                a++;
            }
        }
        System.out.println("a= " + a + " b=" + b);
    }
}

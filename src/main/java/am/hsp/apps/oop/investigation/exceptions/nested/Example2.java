package main.java.am.hsp.apps.oop.investigation.exceptions.nested;

import java.io.IOException;

public class Example2 {

    public static void main(String[] args) {

        try {
            System.out.println("1st try started:");

            try {
               // int a = 42 / 0;

                System.out.println("2nd try started");
                throw new IOException();
            } catch (Exception e) {
                System.out.println("Caught from inner 2nd block");
                System.out.println(e);
                throw new RuntimeException();
            }
        } catch (Exception e) {
            System.out.println("Caught from outer block");
            System.out.println(e);
        }
    }
}

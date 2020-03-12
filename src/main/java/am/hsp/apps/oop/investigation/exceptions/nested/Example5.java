package main.java.am.hsp.apps.oop.investigation.exceptions.nested;

public class Example5 {

    public static void main(String[] args) {
        int i = 7;

        try {
            System.out.println("In outer try block");
            i = 8;
            try {
                System.out.println("In inner try block");
                i = 9;
            } finally {
                System.out.println("In inner finally block");
                i = 10;
            }
        } finally {
            System.out.println("In outer finally block");
            i = 11;
        }

        System.out.println(i);
    }

}

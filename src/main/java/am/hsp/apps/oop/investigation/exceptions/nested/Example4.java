package main.java.am.hsp.apps.oop.investigation.exceptions.nested;

public class Example4 {

    public static void main(String[] args) {
        
        System.out.println("a");
        System.out.println("b");

        try {
            int a = args.length;
            int b = 42 / a;

            System.out.println("a = " + a);
            try {

                if (a == 1)
                    a = a / (a - a);
                if (a == 2) {
                    int c[] = { 1 };
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out-of-bounds: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        }
    }
}

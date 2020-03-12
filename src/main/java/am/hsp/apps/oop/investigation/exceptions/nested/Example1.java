package main.java.am.hsp.apps.oop.investigation.exceptions.nested;

public class Example1 {

    public static void main(String[] args) {
        
        try {
            System.out.println("ABOVE nested try-catch block");
            try {
                int result = 18 / 0;
                System.out.println("The result of division : " + result);
            } catch (ArithmeticException aex) {
                System.out.println(aex);
            }
            System.out.println("BELOW nested try-catch block");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("end");
    }
}

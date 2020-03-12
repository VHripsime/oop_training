package main.java.am.hsp.apps.oop.investigation.exceptions;

public class SimpleExample {

    public static int getNumerator() {
        return 4;
    }

    public static int getDenominator() {
        return 0;
    }

    public static int getResult() {
        return getNumerator() / getDenominator();
    }

    public static void getQuotient() {
        try {
            getResult();
        } catch (Exception e) {
            System.out.println("Error occurred");
        }
    }

    public static void main(String[] args) {
        getQuotient();
    }
}

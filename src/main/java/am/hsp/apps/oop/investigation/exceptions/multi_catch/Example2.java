package main.java.am.hsp.apps.oop.investigation.exceptions.multi_catch;

public class Example2 {

    public static void main(String[] args) {

        calculate();
    }

    public static void calculate() {
        try {
            int[] array = new int[5];
            if (array[5] == 0 || (5 / 0 == 4)) {
                System.out.println("in if()");
            }

        } catch (ArithmeticException e) {
            System.out.println("AE");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("AIOOBE");
        }
    }
}

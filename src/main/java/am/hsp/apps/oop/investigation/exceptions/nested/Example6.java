package main.java.am.hsp.apps.oop.investigation.exceptions.nested;

public class Example6 {
    
    public static void main(String[] args) {
        
        int[] num = { 12, 24, 36, 48, 60, 72 };
        int[] den = { 2, 4, 0, 6 };
        
        try {
            for (int i = 0; i < num.length; i++) {
                try {
                    System.out.println(num[i] + "/" + den[i] + " = " + num[i] / den[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Inner:integer division by 0 not possile");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("outer:Array Index out of Bounds");
        }

    }
}

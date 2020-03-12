package main.java.am.hsp.apps.oop.investigation.exceptions.nested;

public class Example3 {
    
    public static void main(String args[]) {
        
        try {            
            try {
                System.out.println("going to divide");
                int b = 39 / 0;
            } finally {
                System.out.println("finally");
            }

            System.out.println("other statement");
        } catch (Exception e) {
            System.out.println("handeled");
        } finally {
            System.out.println("outer finally");
        }

        System.out.println("normal flow..");
    }
}

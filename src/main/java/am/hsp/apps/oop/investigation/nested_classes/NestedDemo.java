package main.java.am.hsp.apps.oop.investigation.nested_classes;

public class NestedDemo {
    static String s;

    static class Nested {
        void testMethod() {
            s = "Set from Inner";
        }
    }
    
    public static void main(String[] args) {
        System.out.println(new NestedDemo().s);
       
        NestedDemo.Nested inner = new  NestedDemo.Nested();
        inner.testMethod();
        System.out.println(new NestedDemo().s);
    }
}
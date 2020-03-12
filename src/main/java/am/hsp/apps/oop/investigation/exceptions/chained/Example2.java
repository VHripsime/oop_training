package main.java.am.hsp.apps.oop.investigation.exceptions.chained;

public class Example2 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            // System.out.println(e.getCause());
            // System.out.println(e.getMessage());
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("Thrown in method1()", e);
        }
    }

    public static void method2() throws Exception {
        try {
            method3();
        } catch (Exception e) {
            throw new Exception("Thrown in method2()", e);
        }
    }

    public static void method3() throws Exception {
        throw new Exception("Thrown in method3()");
    }

}

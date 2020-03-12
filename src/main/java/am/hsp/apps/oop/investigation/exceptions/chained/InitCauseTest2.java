package main.java.am.hsp.apps.oop.investigation.exceptions.chained;

public class InitCauseTest2 {

    public static void main(String[] args) {

        try {
            myMethod();
        } catch (MyException e) {
            System.out.println(e);
            System.out.print("Cause: ");
            e.myPrint();
        }
    }

    public static void myMethod() {
        MyException myException = new MyException();
        myException.initCause(new RuntimeException());
        throw myException;
    }

}

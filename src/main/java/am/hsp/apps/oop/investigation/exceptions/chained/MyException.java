package main.java.am.hsp.apps.oop.investigation.exceptions.chained;

public class MyException extends RuntimeException {

    private static final long serialVersionUID = -5402747005817375399L;

    public void myPrint() {
        System.out.println(this.getCause());
    }
}

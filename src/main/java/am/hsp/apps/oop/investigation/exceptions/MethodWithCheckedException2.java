package main.java.am.hsp.apps.oop.investigation.exceptions;

import java.io.IOException;

public class MethodWithCheckedException2 {

    public void readFile(String file) throws IOException {
        System.out.println("readFile");
    }

    void useReadFile(String name) {
        try {
            readFile(name);
        } catch (IOException e) {
            System.out.println("catch-IOException");
        }
    }

    public static void main(String args[]) throws Throwable {
        new MethodWithCheckedException2().useReadFile("foo");
    }
}

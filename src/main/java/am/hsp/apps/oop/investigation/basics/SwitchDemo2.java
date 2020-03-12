package main.java.am.hsp.apps.oop.investigation.basics;
/**
 * Checking the answer, if we move the "default" line up.
 * 
 * @author hripsime
 *
 */
public class SwitchDemo2 {

    public static void main(String[] args) {

        int i = 5;

        switch (i) {

        default:
            System.out.println("default");
        case 1:
            System.out.println(1);
        case 2:
            System.out.println(2);
        }
    }
}

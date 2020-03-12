package main.java.am.hsp.apps.oop.investigation.annotations.single_member;

/**
 * We can also not specify the function name "value".
 * 
 * @author user
 *
 */
public class Demo {

    @SingleMember(5)
    public static void m1() {
        System.out.println("Only value");
    }

    @SingleMember(value = 55)
    public static void m2() {
        System.out.println("With member name");
    }
}

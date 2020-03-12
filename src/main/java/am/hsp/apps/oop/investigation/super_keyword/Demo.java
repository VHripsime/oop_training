package main.java.am.hsp.apps.oop.investigation.super_keyword;

public class Demo {

    public static void main(String[] args) {
        // This line assigns 3 and 4 to its a and b members.
        Child child = new Child(3, 4);

        Parent parent = new Parent();

        System.out.println("Child members:");
        System.out.println("a = " + child.a);
        System.out.println("b = " + child.b);

        child.callParentMembers();

        System.out.println("Parent members:");
        System.out.println("a = " + parent.a);
        System.out.println("b = " + parent.b);
    }
}

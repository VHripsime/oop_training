package main.java.am.hsp.apps.oop.investigation.super_keyword;

public class Child extends Parent {

    Child(){        
    }

    Child(int x, int y) {
        super(x, y);
    }

    public void callParentMembers() {
        System.out.println("Child calls parent's a and b");
        System.out.println(super.a + " " + super.b);
    }
}

package main.java.am.hsp.apps.oop.investigation.overriding.example_3;

public abstract class Bird {

    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void print(){
        System.out.println("Bird");
    }
    
    public static void main(String[] args) {
        Bird b = new Pelican();

        b.fly();
    }
}

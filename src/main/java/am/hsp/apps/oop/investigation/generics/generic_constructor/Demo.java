package main.java.am.hsp.apps.oop.investigation.generics.generic_constructor;

public class Demo {

    public static void main(String[] args) {

        Value intValue = new Value(7);
        Value doubleValue = new Value(7.3);
        Value floatValue = new Value(7.3f);

        System.out.println(intValue.getNumber());
        System.out.println(doubleValue.getNumber());
        System.out.println(floatValue.getNumber());
    }
}

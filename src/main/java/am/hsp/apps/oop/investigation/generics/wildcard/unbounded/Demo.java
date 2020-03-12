package main.java.am.hsp.apps.oop.investigation.generics.wildcard.unbounded;

public class Demo {

    public static void main(String[] args) {

        Operation<Integer> intArray = new Operation<Integer>(new Integer[] { 2, 1, 3, 6 });
        Operation<Double> doubleArray = new Operation<Double>(new Double[] { 2.0, 1.0, 3.0, 6.0 });

        System.out.println(intArray.isAverageSame(doubleArray));
    }
}



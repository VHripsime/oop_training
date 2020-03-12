package main.java.am.hsp.apps.oop.investigation.generics.generic_interfaces;

public interface MinMax<T extends Comparable<T>> {
    
    T min();
    T max();
}

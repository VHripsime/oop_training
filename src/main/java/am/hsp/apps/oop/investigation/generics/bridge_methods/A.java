package main.java.am.hsp.apps.oop.investigation.generics.bridge_methods;

public class A<T> {

    private T object;

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param object
     */
    public A(T object) {
        this.object = object;
    }
    
    public T getObject() {
        return this.object;
    }

    /**
     * After type erasure the argument type will become Object.
     * 
     * @param data
     */
    public void setData(T data) {
        System.out.println("superclass method:");
        this.object = data;
    }
}

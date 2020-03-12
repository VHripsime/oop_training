package main.java.am.hsp.apps.oop.investigation.generics.bridge_methods;

/**
 * In the program, the subclass extends A, but does so using a String-specific
 * version of A.
 * 
 * @author hripsime
 *
 */
public class B extends A<String> {

    /**
     * Constructor for initializing the instance member by the given input.
     * 
     * @param data
     */
    public B(String data) {
        super(data);
    }

    /**
     * After type erasure, the methods signatures do not match.
     */
    @Override
    public void setData(String data) {
        System.out.println("subclass method:");
        super.setData(data);
    }

    /**
     * To solve the problem occurred after the type erasure, a Java compiler generates a
     * bridge method to ensure that subtyping works as expected.
     * 
     * @param data
     */
//    public void setData(Object data) {
//        setData((String) data);
//    }
}

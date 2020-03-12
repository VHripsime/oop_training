package main.java.am.hsp.apps.oop.investigation.annotations.marker;

import java.lang.reflect.Method;

/**
 * Checking whether it contains @MyMarker.
 * 
 * @author user
 *
 */
public class Demo {

    @MyMarker()
    public void test() {
        System.out.println("Marker annotations");
    }

    public static void main(String[] args) {
        Class<?> myClass = Demo.class;

        try {
            Method method = myClass.getMethod("test");

            if (method.isAnnotationPresent(MyMarker.class)) {
                System.out.println("MyMarker is present");
            }
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }
}

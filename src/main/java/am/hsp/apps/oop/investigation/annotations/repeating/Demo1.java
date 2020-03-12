package main.java.am.hsp.apps.oop.investigation.annotations.repeating;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * In order to get the annotations, the program accesses the repeated
 * annotations by calling getAnnotation(), passing in the class of the container
 * annotation, not the repeatable annotation, itself.
 * 
 * @author user
 *
 */
public class Demo1 {

    @MyAnnotation(info = "First annotation", value = 1)
    @MyAnnotation(info = "Second annotation", value = 2)
    public static void myMethod() {
        Class<?> myClass = Demo1.class;

        try {
            Method method = myClass.getMethod("myMethod", String.class, int.class);
            Annotation anno = method.getAnnotation(MyAnnotationContainer.class);

            System.out.println(anno);
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String args[]) {
        myMethod();
    }
}

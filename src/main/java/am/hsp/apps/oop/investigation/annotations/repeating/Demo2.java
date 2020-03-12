package main.java.am.hsp.apps.oop.investigation.annotations.repeating;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Another way to obtain the repeated annotations is to use
 * getAnnotationsByType() or getDeclaredAnnotationsByType(), which can operate
 * directly on a repeated annotation.
 * 
 * @author user
 *
 */
public class Demo2 {
    @MyAnnotation(info = "First annotation", value = 1)
    @MyAnnotation(info = "Second annotation", value = 2)
    public static void myMethod() {
        Class<?> myClass = Demo1.class;

        try {
            Method method = myClass.getMethod("myMethod", String.class, int.class);
            Annotation[] annos = method.getDeclaredAnnotationsByType(MyAnnotation.class);

            for (Annotation anno : annos) {
                System.out.println(anno);
            }
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String args[]) {
        myMethod();
    }
}

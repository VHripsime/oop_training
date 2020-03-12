package main.java.am.hsp.apps.oop.investigation.annotations.type_annotations;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.FirstAnnotation;
import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.SecondAnnotation;

/**
 * Annotating the exceptions in throws clause and then trying to get each
 * exception with its annotation types...
 * 
 * @author user
 *
 */
public class AnnotatingExceptions {

    public void test() throws @FirstAnnotation @SecondAnnotation IOException, @FirstAnnotation ArithmeticException {
        System.out.println("Annotating an exception");
    }

    public static void main(String[] args) {
        Class<?> myClass = AnnotatingExceptions.class;

        try {
            Method method = myClass.getMethod("test");
            AnnotatedType[] types = method.getAnnotatedExceptionTypes();

            for (AnnotatedType type : types) {
                System.out.println("Annotated exception: " + type.getType().getTypeName());
                Annotation[] annotations = type.getAnnotations();

                for (Annotation annotation : annotations) {
                    System.out.println("Annotation type: " + annotation.annotationType().getSimpleName());
                }

                System.out.println();
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

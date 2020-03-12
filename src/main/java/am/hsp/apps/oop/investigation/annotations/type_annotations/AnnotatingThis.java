package main.java.am.hsp.apps.oop.investigation.annotations.type_annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.FirstAnnotation;

/**
 * We can also annotate the type of this (called the receiver). We can
 * explicitly declare this as the first parameter to a method.
 * 
 * @author user
 *
 */
public class AnnotatingThis {

    public void myMethod(@FirstAnnotation AnnotatingThis this, int i) {
    }

    public static void main(String[] args) {
        
        Class<?> myClass = AnnotatingThis.class;

        try {
            Method method = myClass.getMethod("myMethod", int.class);
            AnnotatedType type = method.getAnnotatedReceiverType();

            System.out.println(type.getType().getTypeName());
            Annotation[] annotations = type.getAnnotations();

            for (Annotation annotation : annotations) {
                System.out.println(annotation.annotationType().getSimpleName());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

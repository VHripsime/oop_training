package main.java.am.hsp.apps.oop.investigation.annotations.type_annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.TypeVariable;

import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.ParamAnnotation;

/**
 * Using an annotation on a type parameter, and then trying to get it.
 * 
 * @author user
 *
 * @param <T>
 */
public class AnnotatingParam<@ParamAnnotation T> {

    public static void main(String[] args) {
        
        Class<?> myClass = AnnotatingParam.class;
        TypeVariable<?>[] typeVariables = myClass.getTypeParameters();

        for (TypeVariable<?> typeVariable : typeVariables) {

            System.out.println("Annotated variable type is: " + typeVariable.getTypeName());
            Annotation[] annotations = typeVariable.getAnnotations();

            for (Annotation annotation : annotations)
                System.out.println("Annotation type: " + annotation.annotationType().getSimpleName());
        }
    }
}

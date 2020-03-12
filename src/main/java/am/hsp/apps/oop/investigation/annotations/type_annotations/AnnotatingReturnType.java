package main.java.am.hsp.apps.oop.investigation.annotations.type_annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;

import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.FirstAnnotation;
import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.MethodAnnotation;
import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.SecondAnnotation;

/**
 * In the 1st method we are annotating the return type, and in the 2nd one the
 * method itself. In both cases, an annotation precedes the method�s return
 * type. So, the target specification is used to specify each annotation role.
 * 
 * @author user
 *
 */
public class AnnotatingReturnType {

    // Annotates the return type.
    public @FirstAnnotation @SecondAnnotation Integer myFirstMethod(int j, int k) {
        return j + k;
    }

    // Annotates the method declaration.
    public @MethodAnnotation Integer mySecondMethod(String str) {
        return str.length() / 2;
    }

    public static void main(String[] args) {

        Class<?> myClass = AnnotatingReturnType.class;

        try {
            Method method = myClass.getMethod("myFirstMethod", int.class, int.class);
            AnnotatedType type = method.getAnnotatedReturnType();
            Annotation[] annotations = type.getAnnotations();

            System.out.println("Annotated return type: " + type.getType().getTypeName());

            for (Annotation annotation : annotations) {
                System.out.println(annotation.annotationType().getSimpleName());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}

package main.java.am.hsp.apps.oop.investigation.annotations.type_annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;

import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.FieldAnnotation;
import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.FirstAnnotation;

/**
 * The target of each annotation specifies which they annotate.
 * 
 * @author user
 *
 */
public class AnnotatingField {

    // This annotates the field firstName
    @FirstAnnotation
    @FieldAnnotation
    public String firstName;

    // Annotates the type String
    @FirstAnnotation
    public String lastName;

    public static void main(String[] args) {

        Class<?> myClass = AnnotatingField.class;

        try {
            Field[] fields = myClass.getFields();

            for (Field field : fields) {
                System.out.println("Annotated type: " + field.getName());
                Annotation[] annotations = field.getAnnotations();

                for (Annotation annotation : annotations) {
                    System.out.print("The annotations are: ");
                    System.out.println(annotation.annotationType().getSimpleName());
                }

                System.out.println();
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}

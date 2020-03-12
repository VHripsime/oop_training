package main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * An annotation that can be applied to a type.
 * 
 * @author user
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
public @interface FirstAnnotation {

    String value() default "The 1st custom annotation";
}

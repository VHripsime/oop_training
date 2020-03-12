package main.java.am.hsp.apps.oop.investigation.annotations.repeating;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Making MyAnnotation repeatable...
 * 
 * @author user
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyAnnotationContainer.class)
public @interface MyAnnotation {

    String info() default "testing";

    int value() default 0;
}

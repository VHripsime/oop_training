package main.java.am.hsp.apps.oop.investigation.annotations.repeating;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The container annotation...
 * 
 * @author user
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationContainer {

    MyAnnotation[] value();
}

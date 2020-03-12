package main.java.am.hsp.apps.oop.investigation.annotations.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Specifying the targets, where it can be allowed to annotate.
 * 
 * @author user
 *
 */
@Target({ ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.LOCAL_VARIABLE,
        ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER, ElementType.TYPE })
public @interface CustomerAnnotation {

    public int value() default 3;
}

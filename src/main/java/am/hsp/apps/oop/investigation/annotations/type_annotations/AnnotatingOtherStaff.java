package main.java.am.hsp.apps.oop.investigation.annotations.type_annotations;

import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.FirstAnnotation;

/**
 * Using type annotation with inheritance clause...
 * 
 * @author user
 *
 */
public class AnnotatingOtherStaff<T> extends @FirstAnnotation AnnotatingReturnType {

    // Using a type annotation on a type argument.
    AnnotatingOtherStaff<@FirstAnnotation Integer> firstObject = new AnnotatingOtherStaff<>();

    // Using a type annotation with new.
    AnnotatingOtherStaff<Integer> secondObject = new @FirstAnnotation AnnotatingOtherStaff<Integer>();

    // Using a type annotation on a cast.
    Object x = new Integer(10);
    Integer y = (@FirstAnnotation Integer) x;
}

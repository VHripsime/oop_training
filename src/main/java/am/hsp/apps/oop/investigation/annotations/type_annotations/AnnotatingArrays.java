package main.java.am.hsp.apps.oop.investigation.annotations.type_annotations;

import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.FirstAnnotation;
import main.java.am.hsp.apps.oop.investigation.annotations.type_annotations.my_annotations.SecondAnnotation;

/**
 * In the first declaration @FirstAnnotation annotates the type of the first
 * level, and @SecondAnnotation annotates the type of the second level. In the
 * second declaration the element type Integer is annotated.
 * 
 * @author user
 *
 */
public class AnnotatingArrays {

    // Annotate array levels.
    String @FirstAnnotation [] @SecondAnnotation [] w;

    // Annotate the array element type.
    @FirstAnnotation
    Integer[] vec;
}

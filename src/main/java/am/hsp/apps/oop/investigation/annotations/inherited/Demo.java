package main.java.am.hsp.apps.oop.investigation.annotations.inherited;

/**
 * If the parent class is annotated with an annotation tagged @Inherited, then
 * that annotation automatically is being inherited by the parent calss'
 * subclasses.
 * 
 * @author user
 *
 */
public class Demo {

    public static void main(String[] args) {
        Class<?> myClass = B.class;

        boolean doesContainGreenAnno = myClass.isAnnotationPresent(GreenAnnotation.class);
        boolean doesContainWhiteAnno = myClass.isAnnotationPresent(WhiteAnnotation.class);

        if (doesContainWhiteAnno) {
            System.out.println("Contains White Annotation");
        } else if (doesContainGreenAnno) {
            System.out.println("Contains Green Annotation");
        }
    }
}

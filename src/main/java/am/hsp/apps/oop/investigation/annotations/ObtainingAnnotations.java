package main.java.am.hsp.apps.oop.investigation.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ObtainingAnnotations {

    static Class<?> myClass = Student.class;

    public static void main(String[] args) {

        try {
            printClassAnnotation();
            printAgeFieldAnnotation();
            printNameFieldAnnotation();
            printEnumFieldAnnotation();
            printEnumFieldAnnotations();
            printInfoMethodAnnotation();
            printToStringMethodAnnotation();
            printConstructorsParamsAnnotations();

        } catch (NoSuchFieldException e) {
            System.out.println("Field Not Found");
        } catch (NoSuchMethodException e) {
            System.out.println("Method Not Found");
        }
    }

    private static void printClassAnnotation() {
        System.out.println("Getting annotation of the class: ");
        MyAnnotation classAnnotation = myClass.getAnnotation(MyAnnotation.class);
        System.out.println(classAnnotation.info() + " : " + classAnnotation.value());
    }

    private static void printAgeFieldAnnotation() throws NoSuchFieldException {
        System.out.println("\nGetting annotation of the field _age_ : ");
        Field fieldAge = myClass.getField("age");
        MyAnnotation ageAnnotation = fieldAge.getAnnotation(MyAnnotation.class);
        System.out.println(ageAnnotation.info() + " : " + ageAnnotation.value());
    }

    private static void printNameFieldAnnotation() throws NoSuchFieldException {
        System.out.println("\nGetting annotation of the field _name_ : ");
        Field fieldName = myClass.getDeclaredField("name");
        MyAnnotation nameAnnotation = fieldName.getAnnotation(MyAnnotation.class);
        System.out.println(nameAnnotation.info() + " : " + nameAnnotation.value());
    }

    private static void printEnumFieldAnnotation() throws NoSuchFieldException {
        System.out.println("\nGetting annotation of the enum member: ");
        Field enumField = myClass.getDeclaredField("GOOD");
        MyAnnotation markAnnotation = enumField.getAnnotation(MyAnnotation.class);
        System.out.println(markAnnotation.info() + " : " + markAnnotation.value());
    }

    private static void printEnumFieldAnnotations() throws NoSuchFieldException {
        System.out.println("\nGetting all annotations of the enum member: ");
        Field enumField = myClass.getDeclaredField("GOOD");
        Annotation[] annotations = enumField.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

    private static void printInfoMethodAnnotation() throws NoSuchMethodException {
        System.out.println("\nGetting annotation of the getInfo() method: ");
        Method methodGetInfo = myClass.getMethod("getInfo", int.class);
        MyAnnotation getInfoMethodAnnotation = methodGetInfo.getAnnotation(MyAnnotation.class);
        System.out.println(getInfoMethodAnnotation.info() + " : " + getInfoMethodAnnotation.value());
    }

    private static void printToStringMethodAnnotation() throws NoSuchMethodException {
        System.out.println("\nGetting MyAnnotation of the toString() method: ");
        Method methodToString = myClass.getMethod("toString");
        MyAnnotation toStringMethodAnnotation = methodToString.getAnnotation(MyAnnotation.class);
        System.out.println(toStringMethodAnnotation.info() + " : " + toStringMethodAnnotation.value());
    }

    private static void printConstructorsParamsAnnotations() {
        System.out.println("\nGetting constructors parameters annotations: ");
        System.out.println();
        Constructor<?>[] constructors = myClass.getConstructors();

        for (Constructor<?> constructor : constructors) {
            printConstructorWithParamsAnnotations(constructor);
        }
    }

    private static void printConstructorWithParamsAnnotations(Constructor<?> constructor) {
        System.out.println("Constructor with " + constructor.getParameterCount() + " parameters: ");
        Parameter[] params = constructor.getParameters();
        Annotation[][] annotations = constructor.getParameterAnnotations();

        int i = 0;
        for (Parameter param : params) {
            printParamWithAnnotations(param, annotations[i]);
            i++;
        }
    }

    private static void printParamWithAnnotations(Parameter param, Annotation[] annotations) {
        System.out.println("param: " + param);
        System.out.print("Annotations: ");

        for (int j = 0; j < annotations.length; j++) {
            System.out.println(annotations[j]);
        }

        System.out.println();
    }
}

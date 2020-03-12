package main.java.am.hsp.apps.oop.investigation.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@CustomerAnnotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

    String info() default "volunteer";

    int value() default 1;
}

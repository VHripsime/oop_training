package main.java.am.hsp.apps.oop.investigation.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface OtherAnnotation {

    public String description();
}

package main.java.am.hsp.apps.oop.investigation.annotations.single_member;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface SingleMember {

    int value();
}

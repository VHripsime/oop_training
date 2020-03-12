package main.java.am.hsp.apps.oop.investigation.enums;

/**
 * Enum without any instance
 * 
 * @author hripsime
 *
 */
public enum EmptyEnum {
    ; // required to avoid compiler error, also signifies no instance

    public static boolean isValid() {
        return false;
    }
}

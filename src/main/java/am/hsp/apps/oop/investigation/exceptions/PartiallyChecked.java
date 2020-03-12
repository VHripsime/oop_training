package main.java.am.hsp.apps.oop.investigation.exceptions;

/**
 * As Exception and Throwable are not fully checked exceptions, we can catch
 * them, though the try block does not throw any of them.
 * 
 * @author hripsime
 *
 */
public class PartiallyChecked {

    public static void main(String[] args) {

        try {

        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable e) {
            System.out.println("Throwable");
        }
    }

}

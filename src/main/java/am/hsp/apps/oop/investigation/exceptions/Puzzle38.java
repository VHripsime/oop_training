package main.java.am.hsp.apps.oop.investigation.exceptions;

/**
 * As we see, it is not allowed to initialize the constant in try block, though
 * it is situated in the static block.
 * 
 * @author hripsime
 *
 */
public class Puzzle38 {

    public static final long GUEST_USER_ID = -1;
//    private static final long USER_ID;
//
//    static {
//
//        try {
//            USER_ID = getUserId();
//
//        } catch (IdUnavailableException e) {
//            USER_ID = GUEST_USER_ID;
//            System.out.println("Logging in as guest");
//        }
//    }

    private static long getUserId() throws IdUnavailableException {
        throw new IdUnavailableException(); // Simulate an error
    }
}

class IdUnavailableException extends Exception {

    private static final long serialVersionUID = 5407170884739030314L;
}
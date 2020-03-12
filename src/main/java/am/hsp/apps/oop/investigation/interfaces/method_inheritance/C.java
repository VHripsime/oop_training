package main.java.am.hsp.apps.oop.investigation.interfaces.method_inheritance;

/**
 * By ovverriding the m() method we are getting a CE, as the return types of the
 * 2 methods are incompatible.
 * 
 * @author user
 *
 */
public class C implements A /*, B */ {

    // @Override
    // public int m(int i) {
    // return 0;
    // }
    
    @Override
    public int m(int i) {
        // TODO Auto-generated method stub
        return 0;
    }

}

package main.java.am.hsp.apps.oop.investigation.access_modifiers.same_package;

/**
 * As we can see, all the members are available here except the private one.
 * 
 * @author hripsime
 *
 */
public class Simple {

    public void test() {
        BaseA a = new BaseA();
        a.nPublic = 10;
        a.nProtected = 20;
        a.nNoAccessModifier = 30;
    }
}

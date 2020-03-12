package main.java.am.hsp.apps.oop.investigation.access_modifiers.other_package;

import main.java.am.hsp.apps.oop.investigation.access_modifiers.same_package.BaseA;

/**
 * As we can see, only public member is available here.
 * 
 * @author hripsime
 *
 */
public class Simple {

    public void test() {
        BaseA bbb = new BaseA();
        bbb.nPublic = 10;
        // bbb.nProtected = 20;
        // bbb.nNoAccessModifier = 30;
    }
}

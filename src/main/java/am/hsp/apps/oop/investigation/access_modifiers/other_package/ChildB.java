package main.java.am.hsp.apps.oop.investigation.access_modifiers.other_package;

import main.java.am.hsp.apps.oop.investigation.access_modifiers.same_package.BaseA;

/**
 * Only public and protected members are available in child class, which is
 * inside another package.
 * 
 * @author hripsime
 *
 */
public class ChildB extends BaseA {

    public void test() {
        nPublic = 10;
        nProtected = 20;
        // nNoAccessModifier = 30;

        // nPrivate = 50;

        BaseA bbb = new BaseA();
        bbb.nPublic = 10;
        // bbb.nProtected = 20;
        // bbb.nNoAccessModifier = 30;
    }
}

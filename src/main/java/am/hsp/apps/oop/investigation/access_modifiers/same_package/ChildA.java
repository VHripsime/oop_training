package main.java.am.hsp.apps.oop.investigation.access_modifiers.same_package;

class ChildA extends BaseA {

    public void test() {
        nPublic = 10;
        nProtected = 20;
        nNoAccessModifier = 30;
        //nPrivate = 50;

        BaseA baseA = new BaseA();
        baseA.nPublic = 10;
        baseA.nProtected = 20;
        baseA.nNoAccessModifier = 30;
    }
}

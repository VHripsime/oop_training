package main.java.am.hsp.apps.oop.investigation.nested_classes;

/**
 * We can't declare a static method inside an inner class
 * @author user
 *
 */
public class StaticMethodInsideInner {

    static int in = 1;

    Inner i = new Inner();
    int j = i.k;

    class Inner {

        final static int y = 4;
        private int k = 5;

//        final static void test() {
//            Outer o = new Outer();
//        }
    }
}

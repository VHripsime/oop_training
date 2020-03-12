package main.java.am.hsp.apps.oop.investigation.nested_classes;

/**
 * Creating a class inside for() loop.
 * 
 * @author user
 *
 */
public class ClassInBlock {

    int outer_x = 100;

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {
        ClassInBlock c = new ClassInBlock();
        c.test();
    }

    void test() {
        for (int i = 0; i < 3; i++) {
            class Inner extends StaticMethodInsideInner {
                void display() {
                    Second h = new Second();
                    System.out.println("display: outer_x = " + outer_x);
                    System.out.println(h.s);
                }
            }

            Inner inner = new Inner();
            inner.display();
        }
    }

    class Second {
        int s = 8;
    }
}

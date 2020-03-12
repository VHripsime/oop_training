package main.java.am.hsp.apps.oop.investigation.enums;

/**
 * We can't create an instance of the inner class directly from the
 * ClassInsideEnum:
 * 
 * @author hripsime
 *
 */
public enum ClassInsideEnum {

    VALUE_1, VALUE_2;

    public class MyInnerClass {
        public void showName() {
            System.out.println("Inner class method assigned to " + ClassInsideEnum.this + " instance");
        }
    }

    public MyInnerClass createInnerObject() {
        return new MyInnerClass();
    }

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {
        // ClassInsideEnum.MyInnerClass inner = new ClassInsideEnum.MyInnerClass();

        ClassInsideEnum.VALUE_1.createInnerObject().showName();
        ClassInsideEnum.VALUE_2.createInnerObject().showName();
    }
}

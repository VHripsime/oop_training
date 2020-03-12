package main.java.am.hsp.apps.oop.investigation.enums;

/**
 * By overriding the field inside the enum object, we still get the enum class
 * field.
 * 
 * @author hripsime
 *
 */
public enum FieldOverriding {

    Temporary {
        String info = "temp";

        public void print() {
            System.out.println(info);
        }
    },

    Permanent;

    String info = "usual";

    public void print() {
        System.out.println(info + this.info);
    }

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(FieldOverriding.Temporary.info);
        Temporary.print();
    }
}

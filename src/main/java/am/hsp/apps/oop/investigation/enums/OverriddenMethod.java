package main.java.am.hsp.apps.oop.investigation.enums;

/**
 * If we override a method inside the enum object, that one will be called.
 * 
 * @author hripsime
 *
 */
enum OverriddenMethod {

    Red, Blue, Green {
        public int getColorCode() {
            return 460;
        }
    };

    public int getColorCode() {
        return 110;
    }

    /**
     * Testing...
     * 
     * @param args
     */
    public static void main(String[] args) {
        OverriddenMethod[] colors = OverriddenMethod.values();

        for (OverriddenMethod color : colors) {
            System.out.println(color + " " + color.getColorCode());
        }
    }
}

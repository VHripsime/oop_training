package main.java.am.hsp.apps.oop.investigation.annotations.deprecated;

public class Demo {

    public static void main(String[] args) {
        
        @SuppressWarnings("deprecation")
        Rectangle r = new Rectangle();
        r.width = 7;
        r.length = 8;

        System.out.println(r.getSurface());

        System.out.println(r.width + r.length);

    }

}

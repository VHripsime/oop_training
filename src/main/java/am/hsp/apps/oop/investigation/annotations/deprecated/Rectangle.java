package main.java.am.hsp.apps.oop.investigation.annotations.deprecated;

public class Rectangle {

    /**
     * @deprecated explanation of why it was deprecated
     */
    @Deprecated
    String color;
    int length;
    int width;

    @Deprecated
    public Rectangle() {

    }

    public Rectangle(int length, int width, @Deprecated String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Deprecated
    public int getSurface() {
        return this.length * this.width;
    }
}

package main.java.am.hsp.apps.oop.investigation.enums;

public enum Fruit {

    Apple("red"), Pinapple("brown"), Watermellon, Grape;

    private String color;

    Fruit() {
    }

    Fruit(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

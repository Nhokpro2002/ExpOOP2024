package hus.oop.lab6;

public class Circlee extends Shape {

    private double radius = 1.0;

    public Circlee() {

    }

    public Circlee(double radius) {
        super();
        this.radius = radius;
    }

    public Circlee(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[" + super.toString() + ", radius = " + getRadius() + "]";
    }
}

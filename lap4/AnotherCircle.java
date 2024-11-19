package hus.oop.lap4;

public class AnotherCircle {

    private double radius = 1.0;

    public AnotherCircle() {

    }

    public AnotherCircle(double radius) {
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

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius: " + radius + ", Area: " + getArea() + ", Circumference: " + getCircumference() + "]";
    }
}


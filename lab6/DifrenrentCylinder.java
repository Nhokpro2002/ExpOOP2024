package hus.oop.lab6;

public class DifrenrentCylinder {

    // Cylinder using Composition
    private Circle base;
    private double height;

    public DifrenrentCylinder() {
        base = new Circle();
        height = 1.0;
    }

    public DifrenrentCylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public DifrenrentCylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public String toString() {
        return "Cylinder[" + base.toString() + ", height = " + getHeight() + "]";
    }
}

package hus.oop.lab6;

public class TestCylinder {

    public static void main(String[] args) {
        Circle[] circlesArray = new Circle[3];
        circlesArray[0] = new Circle();
        circlesArray[1] = new Cylinder(3, "yellow", 4);
        circlesArray[2] = new Circle(1, "blue");

        for (Circle circle: circlesArray) {
            //System.out.println(circle);
            System.out.println(circle.getRadius());
        }

    }
}

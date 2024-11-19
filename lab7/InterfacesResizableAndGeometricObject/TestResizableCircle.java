package hus.oop.lab7.InterfacesResizableAndGeometricObject;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle1 = new ResizableCircle(3);
        System.out.println(resizableCircle1);
        System.out.println(resizableCircle1.getArea());
        System.out.println(resizableCircle1.getPerimeter() + "/n");

        resizableCircle1.resize(50);
        System.out.println(resizableCircle1);
    }
}

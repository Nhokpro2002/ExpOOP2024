package hus.oop.lab6;

public class TestDifrenrentCylinder {
    public static void main(String[] args) {
        DifrenrentCylinder cylinder1 = new DifrenrentCylinder();
        System.out.println(cylinder1);
        System.out.println();

        //Circle circle1 = new Circle(2, "green");
        DifrenrentCylinder cylinder2 = new DifrenrentCylinder(new Circle(2, "green"), 3);
        System.out.println(cylinder2);
        System.out.println();

        DifrenrentCylinder cylinder3 = new DifrenrentCylinder(2, "yellow", 11);
        System.out.println(cylinder3);
    }
}

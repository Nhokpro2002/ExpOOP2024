package hus.oop.lab6;

public class TestLine {
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(2, 2);
        Point p2 = new Point(-2, -1);
        Line l2 = new Line(p1, p2);

        Point p3 = new Point(3, 4);
        System.out.println(p3.getX());
        System.out.println(p3.getY());
        p3.setXY(1, 1);
        System.out.println(p3);
        System.out.println();

        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());


        System.out.println(l2);
    }
}

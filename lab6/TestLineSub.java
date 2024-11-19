package hus.oop.lab6;

public class TestLineSub {
    public static void main(String[] args) {
        Point point1 = new Point(-1, 1);
        Point point2 = new Point(0, 2);
        LineSub line1 = new LineSub(point1, point2);
        System.out.println(line1);
        System.out.println(line1.getBeginX());
        System.out.println(line1.getBeginY());
        System.out.println(line1.getEndX());
        System.out.println(line1.getEndY());
        System.out.println(line1.getEnd());
        System.out.println(line1.getBegin());
        line1.setBeginX(0);
        line1.setBeginY(0);
        line1.setEndX(1);
        line1.setEndY(1);
        System.out.println(line1);




    }
}

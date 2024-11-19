package hus.oop.lab5;

public class TestBall {

    public static void main(String[] args) {
        Ball ball1 = new Ball(1, 1, 1, 1, 1);

        // test getter function
        System.out.println(ball1.getX());
        System.out.println(ball1.getY());
        System.out.println(ball1.getxDelta());
        System.out.println(ball1.getyDelta());
        System.out.println(ball1.getRadius());

        //test setter
        ball1.setX(2);
        ball1.setY(2);
        ball1.setRadius(2);
        ball1.setxDelta(2);
        ball1.setyDelta(2);
        ball1.move();
        System.out.println(ball1);

        ball1.reflectHorizontal();
        ball1.reflectVertical();
        System.out.println(ball1);

    }
}

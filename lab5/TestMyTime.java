package hus.oop.lab5;

public class TestMyTime {

    public static void main(String[] args) {

        // test constructor no arg
        MyTime myTime = new MyTime();

        // test constructor with args
        MyTime myTime1 = new MyTime(1, 1, 1);

        // test getter and setter function
        //myTime1.setTime(2, 2, 2);
        System.out.println(myTime1);
        System.out.println("Hour: " + myTime1.getHour());
        System.out.println("Minute: " + myTime1.getMinute());
        System.out.println("Second: " + myTime1.getSecond());
        System.out.println();

        myTime1.setTime(2, 2, 2);
        System.out.println(myTime1);
        myTime1.setHour(3);
        System.out.println("Hour after set value: " + myTime1.getHour());
        myTime1.setMinute(3);
        System.out.println("Minute after set value" + myTime1.getMinute());
        myTime1.setSecond(3);
        System.out.println("Second after set value: " + myTime1.getSecond());
        System.out.println("My Time after set value: " + myTime1);
        System.out.println();

        MyTime myTime2 = new MyTime();
        myTime2.setTime(22, 50, 9);
        System.out.println(myTime2);
        System.out.println("myTime2 + 1second: " + myTime2.nextSecond());
        System.out.println("myTime2 + 1minute: " + myTime2.nextMinute());
        System.out.println("myTime2 + 1hour: " + myTime2.nextHour());
        System.out.println();

        MyTime myTime3 = new MyTime();
        myTime3.setTime(0, 0, 0);
        System.out.println(myTime3);
        System.out.println("myTime3 - 1second: " + myTime3.previousSecond());
        System.out.println("myTime3 - 1minute: " + myTime3.preciousMinute());
        System.out.println("myTime3 - 1hour: " + myTime3.previousHour());

    }
}

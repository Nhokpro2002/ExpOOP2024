package hus.oop.lap1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {

        double radius;
        double diameter;
        double circumference;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius:");
        radius = sc.nextDouble();

        diameter = 2 * radius;
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference: %.2f%n", circumference);

    }
}

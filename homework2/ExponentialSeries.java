package hus.oop.homework2;

import java.util.Scanner;

public class ExponentialSeries {

    public static double specialSeries(double x, int numTerms) {
        double sum = x;
        double coefficient = 1;
        for (int i = 3; i <= numTerms; i += 2) {
            coefficient *= (double) (i - 2 )/( i - 1);
            System.out.println(coefficient);
            sum += coefficient * (Math.pow(x, i) / i);

        }
        return sum;
    }

    public static void testSpecialSeries() {
        Scanner in = new Scanner(System.in);
        System.out.print("User enter x value: ");
        double x = in.nextDouble();
        System.out.print("User enter numTerms value: ");
        int numTerms = in.nextInt();
        System.out.println("The sum of the series: " + specialSeries(x, numTerms));
    }

    public static void main(String[] args) {
        testSpecialSeries();
    }

}

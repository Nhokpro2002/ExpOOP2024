package hus.oop.homework2;

import java.util.Scanner;

public class TrigonometricSeries {

    public static double sin(double x, int numTerms) {
        double sinX = x;
        for (int i = 3; i <= numTerms; i += 2) {
            if (i % 4 == 3) {
                sinX -= (Math.pow(x, i) / computeFactorial(i));
            }
            else {
                sinX += (Math.pow(x, i) / computeFactorial(i));
            }
        }
        return sinX;
    }

    public static double cos(double x, int numTerms) {
        double cosX = 1;
        for (int i = 2; i <= numTerms; i += 2) {
            if (i % 4 == 0) {
                cosX += (Math.pow(x, i) / computeFactorial(i));
            }
            else {
                cosX -= (Math.pow(x, i) / computeFactorial(i));
            }
        }
        return cosX;
    }

    public static void testTrigonometric() {
        Scanner in = new Scanner(System.in);
        System.out.print("User enter for x value: ");
        double x = in.nextDouble();
        System.out.print("User enter for numTerms: ");
        int numTerms = in.nextInt();
        System.out.println("sinX: " + sin(x, numTerms));
        System.out.println(Math.sin(Math.PI));
        System.out.println("cosX: " + cos(x, numTerms));
        System.out.println(Math.cos(Math.PI));

    }

    public static double computeFactorial(int n) {
        double factorial = 1;
        while (n != 1) {
            factorial *= n;
            n--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        testTrigonometric();
    }
}

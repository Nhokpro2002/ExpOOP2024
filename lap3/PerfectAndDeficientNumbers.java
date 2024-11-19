package hus.oop.lap3;

import java.util.Scanner;

public class PerfectAndDeficientNumbers {

    public static boolean isPerfect(int aPosInt) {
        int sum = 0;
        if (aPosInt < 1) {
            return false;
        }
        for (int i = 1; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum == aPosInt) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDeficient(int aPosInt) {
        if (aPosInt < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                sum += i;
            }
        }
        if (sum < aPosInt) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int countPerfectNumber = 0;
        System.out.print("Enter the upper bound: " );
        int input = in.nextInt();
        System.out.println("These numbers are perfect:");
        for (int i = 0; i <= input; i++) {
            if (isPerfect(i)) {
                countPerfectNumber++;
                System.out.print(i + " ");
            }
        }
        double percentPerfectNumber = (countPerfectNumber / (double)input) * 100;
        System.out.println("[" + countPerfectNumber + " perfect numbers found (" + percentPerfectNumber + "%)]" );
        System.out.println();

        int countNormalNumber = 0;
        for (int i = 1; i <= input; i++) {
            if (!isPerfect(i) && !isDeficient(i)) {
                System.out.print(i + " ");
                countNormalNumber++;
            }
        }
        System.out.println();
        double percentNormalNumber = (countNormalNumber / (double) input) * 100;
        System.out.println("[" + countNormalNumber + " numbers found (" + percentNormalNumber + "%)]" );
    }
}

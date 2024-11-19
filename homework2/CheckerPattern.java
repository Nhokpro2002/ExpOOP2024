package hus.oop.homework2;

import java.util.Scanner;

public class CheckerPattern {

    public static void main(String[] args) {
        testCheckerPattern();

    }

    public static void checkerPattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if(row % 2 != 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();

        }
    }

    public static void testCheckerPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        checkerPattern(n);
    }
}

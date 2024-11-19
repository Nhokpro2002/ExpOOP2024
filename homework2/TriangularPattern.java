package hus.oop.homework2;

import java.util.Scanner;

public class TriangularPattern {

    public static void main(String[] args) {
        testTriangularPattern();
    }

    public static void triangularPatternX1(int n, String A) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                if(row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void triangularPatternX2(int n, String B) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                if(row + col <= n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void triangularPatternX3(int n, String C) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if(col <= row) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void triangularPatternX4(int n, String D) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n ; col++) {
                if (row + col >= n + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void testTriangularPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        triangularPatternX1(n, "A");
        triangularPatternX2(n, "B");
        triangularPatternX3(n, "C");
        triangularPatternX4(n, "D");

    }
}

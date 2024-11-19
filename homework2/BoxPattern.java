package hus.oop.homework2;

import java.util.Scanner;

public class BoxPattern {

    public static void main(String[] args) {
        testBoxPattern();
    }

    public static void boxPatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("#  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void boxPatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row == col || row == n) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void boxPatternC(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1 || row + col == n + 1 || row == n) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void boxPatternD(int n) {
        // In phần trên của đồng hồ cát
        for (int i = n; i >= 1; i -= 2) {
            // In khoảng trắng phía trước
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // In viền của đồng hồ cát
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    System.out.print("#"); // In viền ngoài
                } else {
                    System.out.print(" "); // Để trống bên trong
                }
            }
            System.out.println();
        }

        for (int i = 3; i <= n; i += 2) {
            // In khoảng trắng phía trước
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // In viền của đồng hồ cát
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    System.out.print("#"); // In viền ngoài
                } else {
                    System.out.print(" "); // Để trống bên trong
                }
            }
            System.out.println();
        }
    }

    public static void testBoxPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        boxPatternA(size);
        boxPatternB(size);
        boxPatternC(size);
        boxPatternD(size);
    }

}

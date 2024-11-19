package hus.oop.homework2;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {
        int n = test_SquarePattern();
        squarePattern(n);
    }

    public static void squarePattern(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }

    public static int test_SquarePattern() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        return n;
    }

}

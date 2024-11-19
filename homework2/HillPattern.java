package hus.oop.homework2;

public class HillPattern {

    public static void main(String[] args) {
        hillePatternA(5);
        hillePatternB(5);

    }

    public static void hillePatternA(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2*n - 1 ; col++) {
                if ((row + col >= n + 1) && (row >= col - n + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hillePatternB(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= 2*n - 1 ; col++) {
                if ((row <= col) && (col <= 2*n - row)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }



}

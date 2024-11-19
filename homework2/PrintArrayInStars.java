package hus.oop.homework2;

import java.util.Scanner;

public class PrintArrayInStars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printArrayStars(in);
    }

    public static void printArrayStars(Scanner in) {

        System.out.print("Enter the number of items: ");
        final int NUM_ITEMS = in.nextInt();

        System.out.print("Enter the value of all items (separated by space) : ");
        int[] items = new int[NUM_ITEMS];
        for (int i = 0; i < items.length; i++) {
            items[i] = in.nextInt();
        }

        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");
            items[idx] = in.nextInt();
            for (int starNo = 1; starNo <= items[idx]; starNo++) {
                System.out.print("*");
            }
        }
    }
}

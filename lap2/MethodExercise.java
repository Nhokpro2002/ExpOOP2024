package hus.oop.lap2;

import java.util.Scanner;

public class MethodExercise {

    public static int exponent(int base, int exp) {
        while(exp != 0) {
            base *= base;
            exp--;
        }
        return base;
    }

    public static void testExponent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent: ");
        int exp = sc.nextInt();

        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    public static boolean hasEight(int number) {
        while (number != 0) {
            int digit = number % 10;
            if(digit == 8) {
                return true;
            }
            else {
                number /= 10;
            }
        }
        return false;
    }

    public static int testMagicSum(Scanner in) {
        int magicSum = 0;

        // Continuously prompt for positive integers
        while (true) {
            System.out.print("Enter a positive integer (or -1 to end): ");
            int number = in.nextInt();

            // End the loop if the user enters -1
            if (number == -1) {
                break;
            }

            // Check if the number contains the digit '8'
            if (hasEight(number)) {
                magicSum += number; // Add the number to the magic sum
            }
        }

        return magicSum; // Return the final magic sum
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i);
            if (i != array.length - 1) {
                System.out.print(", ");
            }

        }
        System.out.println("]");
    }
}

package hus.oop.lap2;

import java.util.Scanner;

public class ArrayExercise {

    public static int[] createArray(Scanner in) {

        System.out.print("Enter the number of items: ");
        int NUM_ITEMS = in.nextInt();

        int[] items = new int[NUM_ITEMS];

        System.out.println("Enter the values for the items:");
        for (int i = 0; i < NUM_ITEMS; i++) {
            System.out.print("Item " + (i + 1) + ": ");
            items[i] = in.nextInt();
        }

        return items;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] generateStudentGrades(Scanner in) {

        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();

        int[] gradeArray = new int[numStudents];

        for (int i = 0; i < gradeArray.length; i++) {
            System.out.print("Enter the number of students " + (i +1));
            gradeArray[i] = in.nextInt();
        }
        return gradeArray;

    }

    public static void simpleGradesStatistics() {
        Scanner sc = new Scanner(System.in);
        int[] gradeArray = generateStudentGrades(sc);

        int sum = 0;
        for (int i = 0; i < gradeArray.length; i++) {
            sum += gradeArray[i];
        }
        double average = (double) sum / (gradeArray.length + 1);
        System.out.println("The average is: " + average);

        int minValue = gradeArray[0];
        for (int i = 0; i < gradeArray.length; i++) {
            if (minValue > gradeArray[i]) {
                minValue = gradeArray[i];
            }
        }
        System.out.println("The minimum is: " + minValue);

        int maxValue = gradeArray[0];
        for (int i = 0; i < gradeArray.length; i++) {
            if (maxValue > gradeArray[i]) {
                maxValue = gradeArray[i];
            }
        }
        System.out.println("The maximum is: " + maxValue);
    }

    public static String hexadecimalToBinary(String hexStr) {
        StringBuilder binaryStr = new StringBuilder();

        for (char hexChar : hexStr.toCharArray()) {
            String binaryChunk = Integer.toBinaryString(Integer.parseInt(String.valueOf(hexChar), 16));

            while (binaryChunk.length() < 4) {
                binaryChunk = "0" + binaryChunk;
            }

            binaryStr.append(binaryChunk).append(" ");
        }

        return binaryStr.toString().trim(); // Return the final binary string
    }

    public static void testHexadecimalToBinary() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal string: ");
        String hexStr = scanner.nextLine();

        String binaryStr = hexadecimalToBinary(hexStr);

        System.out.println("The equivalent binary for hexadecimal \"" + hexStr + "\" is: " + binaryStr);
    }


}

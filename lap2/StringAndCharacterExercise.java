package hus.oop.lap2;

import java.util.Scanner;
import java.lang.String;

public class StringAndCharacterExercise {

    public static void reverseString(String inStr) {

        int inStrLen;
        inStrLen = inStr.length();

        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            System.out.print(inStr.charAt(charIdx));
        }

    }

    public static void testReverseString() {
        Scanner sc = new Scanner(System.in);
        String inStr;
        inStr = sc.next();
        reverseString(inStr);
    }

    public static int countVowels(String inStr) {
        int sum = 0;
        inStr = inStr.toLowerCase();
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u':
                    sum++;
                    break;
                default:

            }
        }
        return sum;

    }

    public static int countDigits(String inStr) {
        int sum = 0;
        for (int i = 0; i < inStr.length(); i++) {
            switch (inStr.charAt(i)) {
                case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
                    sum++;
                    break;
                default:

            }
        }
        return sum;
    }

    public static void testCountVowelsDigits() {
        Scanner sc = new Scanner(System.in);
        String inStr;

        System.out.print("Enter a String: ");
        inStr = sc.next();

        // Caculus
        int numberVowels = countVowels(inStr);
        int numberDigits = countDigits(inStr);
        int totalLength = inStr.length();

        // Calculate percentages
        double vowelPercentage = (double) (numberVowels / totalLength) * 100;
        double digitPercentage = (double) (numberDigits / totalLength) * 100;

        //Display
        System.out.printf("Number of vowels: %d (%.2f%%)\n", numberVowels, vowelPercentage);
        System.out.printf("Number of digits: %d (%.2f%%)\n", numberDigits, digitPercentage);

    }

    public static String phoneKeyPad(String inStr) {
        StringBuilder result = new StringBuilder();
        inStr = inStr.toLowerCase();
        for (int i = 0; i < inStr.length(); i++) {
            char inChar = inStr.charAt(i);

            switch (inChar) {
                case 'a', 'b', 'c':
                    result.append(2);
                    break;
                case  'd', 'e', 'f':
                    result.append(3);
                    break;
                case  'g', 'h', 'i':
                    result.append(4);
                    break;
                case 'j', 'k', 'l':
                    result.append(5);
                    break;
                case 'm','n', 'o':
                    result.append(6);
                    break;
                case 'p', 'q', 'r', 's':
                    result.append(7);
                    break;
                case 't', 'u', 'v':
                    result.append(8);
                    break;
                case 'w', 'x', 'y', 'z':
                    result.append(9);
                    break;
                default:
                    result.append(inChar);

            }
        }
        return result.toString();
    }

    public static void testPhoneKeyPad() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inStr = sc.next();

        System.out.println("Using Switch-case: " + phoneKeyPad(inStr));
    }

    public static String cipherCaesarCode(String inStr) {
        // Here, Cipher code = 3;
        StringBuilder result = new StringBuilder();
        inStr = inStr.toUpperCase();
        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                char shifted = (char) (((ch - 'A' + 3) % 26) + 'A');
                result.append(shifted);
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void testCypherCaesarCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a planeString: ");
        String inStr = sc.next();
        System.out.println("The ciphertext string: " + cipherCaesarCode(inStr));
    }

    public static String decipherCaesarCode(String inStr) {
        // Here, cipher code = 3;
        StringBuilder result = new StringBuilder();
        inStr = inStr.toUpperCase();

        for (int i = 0; i < inStr.length(); i++) {
            char ch = inStr.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                char shifted = (char) (((ch - 'A' - 3 + 26) % 26) + 'A');
                result.append(shifted);
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void testDicypherCaesarCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String inStr = sc.next();
        System.out.println("The plaintext string is: " + decipherCaesarCode(inStr));
    }

    public static boolean isHexString(String hexStr) {
        for(int i = 0; i < hexStr.length(); i++) {
            char inChar = hexStr.charAt(i);
            if (!((inChar >= '0' && inChar <= '9')
                || (inChar >= 'A' && inChar <= 'F')
                || (inChar >= 'a' && inChar <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static void testHexString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hexStr = sc.next();
        if(isHexString(hexStr)) {
            System.out.println(hexStr + " is a hex string");
        }
        else {
            System.out.println(hexStr + " is NOT a hex string");
        }
    }

    public static int binaryToDecimal(String binStr) {
        int decimalValue = 0;
        for (int i = 0; i < binStr.length(); i++) {
            char bit = binStr.charAt(i);
            if (bit == '1') {
                decimalValue = decimalValue * 2 + 1;
            } else if (bit == '0') {
                decimalValue = decimalValue * 2;
            } else {
                return -1;
            }
        }

        return decimalValue;
    }

    public static void testBinaryToDecimal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Binary string: ");
        String binaryInput = scanner.nextLine();

        int decimalValue = binaryToDecimal(binaryInput);

        if (decimalValue != -1) {
            System.out.println("The equivalent decimal number for binary \"" + binaryInput + "\" is: " + decimalValue);
        } else {
            System.out.println("error: Invalid binary string \"" + binaryInput + "\"");
        }


    }

    public static void main(String[] args) {
        /*testReverseString();
        testCountVowelsDigits();
        testPhoneKeyPad();
        testCypherCaesarCode();
        testDicypherCaesarCode();
        testHexString();
        testBinaryToDecimal(); */

    }

}

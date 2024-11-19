package hus.oop.homework2;

import java.util.Scanner;

public class TestPalindromicWordAndTestPalindromicPhrase {

    public static void main(String[] args) {
        testPalindromicWord();
    }

    public static boolean isPalindromicWord(String inStr) {
        StringBuilder inverseString = new StringBuilder();
        inStr = inStr.toUpperCase();
        for (int i = inStr.length() - 1; i >= 0; i--) {
            char newChar = inStr.charAt(i);
            inverseString.append(newChar);
        }
        return inverseString.toString().equals(inStr);
    }

    public static void testPalindromicWord() {
        Scanner sc = new Scanner(System.in);
        String Str = sc.next();
        if (isPalindromicWord(Str)) {
            System.out.println(Str + " is a palindrome");
        } else {
            System.out.println(Str + " is not a palindrome");
        }


    }


}

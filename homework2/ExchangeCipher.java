package hus.oop.homework2;

import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String[] args) {
        testExchangeCipher();

    }

    public static void exchangeCipher(String in_Str) {
        StringBuilder cipherText = new StringBuilder();
        in_Str = in_Str.toUpperCase();

        for (int i = 0; i < in_Str.length(); i++) {
            char character = in_Str.charAt(i);
            if (Character.isLetter(character)) {
                char newCharacter = (char) ('A' + ('Z' - character));
                cipherText.append(newCharacter);
            }
            else {
                cipherText.append(character);
            }
        }
        System.out.println("The ciphertext string is: " + cipherText);

    }

    public static void testExchangeCipher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String Str = sc.next();
        exchangeCipher(Str);
    }
}

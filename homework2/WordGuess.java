package hus.oop.homework2;

import java.util.Scanner;

public class WordGuess {

    public static void guessWord(String guessString, Scanner in) {
        int trial = 1;
        boolean[] currentCorrectly = new boolean[guessString.length()];
        StringBuilder currentString = new StringBuilder("_".repeat(guessString.length()));

        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String guessedString = in.next().toLowerCase();
            System.out.print("Trials " + trial + ": ");
            if (guessedString.length() == 1) {
                for (int i = 0; i < guessString.length(); i++) {
                    if (guessedString.charAt(0) == guessString.charAt(i) && !currentCorrectly[i]) {
                        currentCorrectly[i] = true;
                        currentString.setCharAt(i, guessedString.charAt(0));
                    }

                }
                System.out.println(currentString);

                if (currentString.toString().equals(guessString)) {
                    System.out.println("Congratulation !");
                    System.out.println("You got in " + trial + " trials" );
                    break;
                }
            }
            else if (guessedString.equals(guessString)) {
                System.out.println("Congratulation !");
                System.out.println("You got in " + trial + " trials" );
                break;
            }
            else {
                System.out.println("Incorrect");
            }
            trial++;
        }
    }

    public static void guessWord() {
        Scanner in = new Scanner(System.in);
        String guessString = "testing";
        guessWord(guessString, in);
    }

    public static void main(String[] args) {
        guessWord();
    }
}
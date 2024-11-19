package hus.oop.homework2;

import java.util.Scanner;

public class NumberGuess {

    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        final int SECRET_NUMBER = (int)(Math.random()*100);
        guessNumber(SECRET_NUMBER, sc);
    }

    public static void guessNumber(int number, Scanner in) {
        int cout = 0;
        System.out.println("Key in your guess:");
        while (true) {
            int guessNumber = in.nextInt();
            cout++;
            if (guessNumber < number) {
                System.out.println("Try higher");
            } else if (guessNumber > number) {
                System.out.println("Try lower");
            } else {
                System.out.println("You got it in " + cout + " trials !");
                break;
            }
        }
    }


}

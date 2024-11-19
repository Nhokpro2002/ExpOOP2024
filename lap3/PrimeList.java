package hus.oop.lap3;

import java.util.Scanner;

public class PrimeList {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
        }
        return true;
    }

    public static void primesNumberList() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the upper bound: ");
        int input = in.nextInt();
        int count = 0;
        for (int i = 1; i <= input; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("[" + count + " primes found ]" );
    }

    public static void main(String[] args) {
        primesNumberList();
    }
}

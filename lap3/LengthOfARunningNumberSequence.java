package hus.oop.lap3;

public class LengthOfARunningNumberSequence {

    public static long length(int n) {
        if (n == 1) {
            return 1;
        }
            return length(n - 1) * 10 + n;
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 13 ; i++) {
            System.out.println("S(" + i + ") = " + length(i));
        }
    }
}

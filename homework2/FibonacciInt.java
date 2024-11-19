package hus.oop.homework2;

public class FibonacciInt {

    public static int calculusFibonacci(int n) {
        int initFibonacci = 1;
        int firstFibonacci = 1;
        int fn = 0;
        int i = 0;

        while (i <= n) {
            if (i == 0 || i == 1) {
                fn = 1;
            } else {
                fn = initFibonacci + firstFibonacci;
            }
            i++;
            initFibonacci = firstFibonacci;
            firstFibonacci = fn;
        }
        return fn;
    }

    public static void fibonacciInt() {
        int i = 0;
        while (true) {
            System.out.println("F(" + i + ") = " + calculusFibonacci(i));
            i++;
            if (calculusFibonacci(i) < calculusFibonacci(i - 1)) {
                System.out.println("F(" + i + ") is out of range of int");
                break;
            }
        }
    }

    public static void main(String[] args) {
fibonacciInt();
    }
}

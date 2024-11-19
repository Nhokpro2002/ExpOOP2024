package hus.oop.lap3;

public class GCD {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else if (b > 0) {
            return gcd(b, a % b);
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(gcd(72, 36));
    }
}

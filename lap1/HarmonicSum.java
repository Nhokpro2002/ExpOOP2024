package hus.oop.lap1;

public class HarmonicSum {
    public static void main(String[] args) {
        final int MAXDENOMINATOR = 50000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double absDiff;

        for (int denominator = 1; denominator <= MAXDENOMINATOR; ++denominator) {
            sumL2R += (double) 1/denominator;
        }
        System.out.println(sumL2R);

        for (int denominator = MAXDENOMINATOR; denominator >= 1; --denominator) {
            sumR2L += (double) 1/denominator;
        }
        System.out.println(sumR2L);

        if(sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
            System.out.println(absDiff);
            System.out.println("sumL2R chính xác hơn");
        }
        else if (sumR2L > sumL2R) {
            absDiff = sumR2L - sumL2R;
            System.out.println(absDiff);
            System.out.println("sumR2L chính xác hơn");
        }
        else {
            System.out.println("Độ chính xác 2 cách tính như nhau");
        }
    }
}

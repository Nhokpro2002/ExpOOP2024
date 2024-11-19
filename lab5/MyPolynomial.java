package hus.oop.lab5;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
             sb.append(coeffs[i] + (i != 0 ? "x^" + i + " = ":""));
        }
        return sb.toString();
    }

    public double evaluate(double x) {
        double sum = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            sum += coeffs[i] * Math.pow(x, i);
        }
        return sum;
    }

    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial result = this;
        if (result.getDegree() < right.getDegree()) {
            result = right;
            right = this;
        }

        double[] resultCoeffs  = result.coeffs;
        double[] anotherCoeffs = right.coeffs;
        for (int i = 0; i < resultCoeffs.length; i++)
        {
            if (i > anotherCoeffs.length-1) {
                continue;
            }
            resultCoeffs[i] += anotherCoeffs[i];
        }
        return null;
    }
}

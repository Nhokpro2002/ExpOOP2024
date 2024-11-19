package hus.oop.lab9.polynomials;

public class ArrayPoly extends AbstractPoly {
    private double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        if (coefficients == null || coefficients.length == 0) {
            throw new IllegalArgumentException("Coefficients cannot be null or empty");
        }
        this.coefficients = coefficients.clone(); // Bảo vệ tính bất biến
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoefficients = this.derive();
        return new ArrayPoly(derivativeCoefficients);
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree >= coefficients.length) {
            return 0; // Trả về 0 nếu bậc không hợp lệ
        }
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return coefficients.clone(); // Trả về một bản sao
    }

    public String type() {
        return "Array poly";
    }
}

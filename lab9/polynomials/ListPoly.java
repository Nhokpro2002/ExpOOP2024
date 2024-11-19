package hus.oop.lab9.polynomials;

import java.util.List;
import java.util.ArrayList;
public class ListPoly extends AbstractPoly {
    List<Double> coefficients = new ArrayList<>();

    public ListPoly(double[] coeffs) {
        if (coeffs == null || coeffs.length == 0) {
            throw new IllegalArgumentException("Coefficients cannot be null or empty");
        }
        this.coefficients = new ArrayList<>();
        for (double coef : coeffs) {
            coefficients.add(coef);
        }
    }


    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        double[] derCoeffs = this.derive(); // Sử dụng phương thức derive() từ AbstractPoly
        return new ListPoly(derCoeffs);    // Trả về đối tượng mới
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree >= coefficients.size()) {
            return 0; // Trả về 0 nếu bậc không hợp lệ
        }
        return coefficients.get(degree);
    }


    @Override
    public double[] coefficients() {
        double[] newCoefficientsArray = new double[coefficients.size()];
        for (int i = 0; i < newCoefficientsArray.length; i++) {
            newCoefficientsArray[i] = coefficients.get(i);
        }
        return newCoefficientsArray;
    }
}

package hus.oop.lab9.polynomials;

import java.util.Arrays;
import java.util.Objects;

/**
 * An abstract class providing an implementation for shared parts of
 * ArrayPoly and ListPoly
 */
public abstract class AbstractPoly implements Poly {

    int degree;

    public AbstractPoly() {

    }

    @Override
    public int degree() {
        degree = coefficients().length - 1;
        return degree;
    }
    double[] derive() {
        if (degree() <= 0) {
            return new double[0]; // Đạo hàm của hằng số là 0
        }
        double[] doubleArray = new double[degree()];
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = (i + 1) * coefficients()[i + 1];
        }
        return doubleArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Kiểm tra tham chiếu
        if (!(o instanceof AbstractPoly)) return false; // Kiểm tra kiểu
        AbstractPoly poly = (AbstractPoly) o;
        if (this.degree() != poly.degree()) return false;
        for (int i = 0; i <= degree(); i++) {
            if (this.coefficients()[i] != poly.coefficients()[i]) {
                return false;
            }
        }
        return true;
    }


    @Override
    public int hashCode() {
        return Arrays.hashCode(coefficients());
    }

    @Override
    public String toString() {
        StringBuilder stringPoly = new StringBuilder();
        for (int i = 0; i <= degree(); i++) {
            if (i > 0) {
                stringPoly.append(" + ");
            }
            if (i == 0) {
                stringPoly.append(coefficients()[i]);
            } else if (i == 1) {
                stringPoly.append(coefficients()[i]).append("x");
            } else {
                stringPoly.append(coefficients()[i]).append("x^").append(i);
            }
        }
        return stringPoly.toString();
    }

}

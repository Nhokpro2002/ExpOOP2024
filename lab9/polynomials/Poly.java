package hus.oop.lab9.polynomials;

/**
 * Interface representing a polynomial with arbitrary grade
 */
public interface Poly {

    /**
     * Returns the degree of the polynomial
     * @return the degree of the polynomial
     */
    int degree();

    /**
     * Returns a new polynomial which is the derivative of the current
     * object. If invoked on object (1), returns object (2)
     * (1) c0 + c1 * x + ... + cn * x^n
     * (2) c1 + 2 * c2 * x + ... + n * cn * x^(n-1)
     * @return a new polynomial which is the derivative of the current object
     */
    Poly derivative();

    /**
     * Returns the coefficient of the monomial with the specified degree
     * @param degree The degree to be queried (get the coefficient)
     * @return The coefficient of the monomial with the specified degree
     */
    double coefficient(int degree);

    /**
     * Returns a double[] containing all the coefficients
     * @return a double[] containing all the coefficients
     */
    double[] coefficients();
}

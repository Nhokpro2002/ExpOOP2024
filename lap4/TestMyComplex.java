package hus.oop.lap4;

import java.util.Scanner;

public class TestMyComplex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        MyComplex complex1 = new MyComplex(real1, imag1);
        System.out.println();

        System.out.print("Enter complex number 2 (real and imaginary part): ");
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();
        MyComplex complex2 = new MyComplex(real2, imag2);
        System.out.println();

        sc.close();

        System.out.println("number 1 is: " + complex1);
        if (complex1.isReal()) {
            System.out.println(complex1 + " is a pure real number");
        } else {
            System.out.println(complex1 + " is NOT a pure real number");
        }

        if (complex1.isImaginary()) {
            System.out.println(complex1 + " is a pure imaginary number");
        } else {
            System.out.println(complex1 + " is a NOT pure imaginary number");
        }
        System.out.println();

        System.out.println("number 2 is: " + complex2);
        if (complex2.isReal()) {
            System.out.println(complex2 + " is a pure real number");
        } else {
            System.out.println(complex2 + " is NOT a pure real number");
        }

        if (complex2.isImaginary()) {
            System.out.println(complex2 + " is a pure imaginary number");
        } else {
            System.out.println(complex2 + " is a NOT pure imaginary number");
        }
        System.out.println();

        if (complex1.equals(complex2)) {
            System.out.println(complex1 + " is equals to " + complex2);
        } else {
            System.out.println(complex1 + " is NOT equals to " + complex2);
        }

        System.out.println(complex1 + " + " + complex2 + " = " + complex1.addInto(complex2));
    }
}


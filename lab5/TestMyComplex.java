package hus.oop.lab5;

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

        // test

        sc.close();

        // test getter and setter function
        complex1.setReal(5);
        System.out.println("Real complex1: " + complex1.getReal());
        complex1.setImag(2);
        System.out.println("Image complex1: " + complex1.getImag());
        complex2.setReal(1);
        System.out.println("Real complex2: " + complex2.getReal());
        complex2.setImag(0);
        System.out.println("Image complex2: " + complex2.getImag());

        // test setValue(double, double) function
        complex1.setValue(2, 2);
        complex2.setValue(1, 1);


        // test isReal() function of complex1
        System.out.println("number 1 is: " + complex1);
        if (complex1.isReal()) {
            System.out.println(complex1 + " is a pure real number");
        } else {
            System.out.println(complex1 + " is NOT a pure real number");
        }

        // test is Imaginary() function of complex1
        if (complex1.isImaginary()) {
            System.out.println(complex1 + " is a pure imaginary number");
        } else {
            System.out.println(complex1 + " is a NOT pure imaginary number");
        }
        System.out.println();

        // test isReal() function of complex2
        System.out.println("number 2 is: " + complex2);
        if (complex2.isReal()) {
            System.out.println(complex2 + " is a pure real number");
        } else {
            System.out.println(complex2 + " is NOT a pure real number");
        }

        // test is Imaginary() function of complex2
        if (complex2.isImaginary()) {
            System.out.println(complex2 + " is a pure imaginary number");
        } else {
            System.out.println(complex2 + " is a NOT pure imaginary number");
        }
        System.out.println();

        // test equals() function
        if (complex1.equals(complex2)) {
            System.out.println(complex1 + " is equals to " + complex2);
        } else {
            System.out.println(complex1 + " is NOT equals to " + complex2);
        }

        System.out.println(complex1 + " + " + complex2 + " = " + complex1.addInto(complex2));

        // test addInto() function
        System.out.println(complex1.addInto(complex2));

        // test addNew() function
        System.out.println(complex2.addNew(complex1));

        // test magnitude() function
        System.out.println("Mangitude of complex1: " + complex1.magnitude());

    }
}


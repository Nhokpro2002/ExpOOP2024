package hus.oop.lab5;

import java.math.BigInteger;

public class TestBigInteger {

    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("111111111111111111111111111111111111111111111111" );
        BigInteger i2 = new BigInteger("2222222222222222222222222222222222222222");
        System.out.println("sum of i1 and i2: " + i1.add(i2));
    }
}

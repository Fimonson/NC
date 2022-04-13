package com.netcracker.HW2.ch1.ex6;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int x) {
        if (x < 0)
            return new BigInteger("-1");
        if (x == 0 || x == 1)
            return new BigInteger("1");
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 2; i <= x; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(factorial(-1));
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(1000));
    }
}


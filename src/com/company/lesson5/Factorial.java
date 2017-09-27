package com.company.lesson5;

public class Factorial {
    public static void foundFactorial() {
        double f = (int) (Math.random() * 10);
        int sum = 1;
        for (int i = 1; i <= f; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}

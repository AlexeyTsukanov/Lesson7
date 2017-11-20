package com.company.lesson17;

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(3, 4.5));
        System.out.println(Calculator.multiply(4, 5));
        System.out.println(Calculator.divide(4, 1));
        System.out.println(Calculator.divide(4, 0));
        System.out.println(Calculator.subtraction(4, 5));
    }

    public static class Calculator {
        public static <T extends Number, V extends Number> double sum(T a, V b) {
            return a.doubleValue() + b.doubleValue();
        }


        public static <T extends Number, V extends Number> double multiply(T a, V b) {
            return a.doubleValue() * b.doubleValue();
        }

        public static <T extends Number, V extends Number> double divide(T a, V b) {
            double c = a.doubleValue() / b.doubleValue();
            if (Double.isInfinite(c)) {
                return 0;
            } else {
                return c;
            }
        }

        public static <T extends Number, V extends Number> double subtraction(T a, V b) {
            return a.doubleValue() - b.doubleValue();
        }
    }
}

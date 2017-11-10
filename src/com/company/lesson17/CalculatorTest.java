package com.company.lesson17;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.sum(3, 4.5);
        Calculator.multiply(4,5);
        Calculator.divide(4, 1);
        Calculator.divide(4, 0);
        Calculator.substraction(4,5);
    }

    public static class Calculator {
        public static <T extends Number, V extends Number> void sum(T a, V b) {
            System.out.println("a + b = " + a + b);
        }


        public static<T extends Number, V extends Number>void multiply(T a, V b){
            System.out.println("a * b = " + (a.doubleValue() * b.doubleValue()));
        }

        public static <T extends Number, V extends Number> void divide(T a, V b){
            double c = a.doubleValue() / b.doubleValue();
            if (Double.isInfinite(c)){
                System.out.println("a / b = 0");
            }
            else System.out.println("a / b = " + c);
        }

        public static <T extends Number, V extends Number> void substraction(T a, V b){
            System.out.println("a - b = " + (a.doubleValue() - b.doubleValue()));
        }
    }
}

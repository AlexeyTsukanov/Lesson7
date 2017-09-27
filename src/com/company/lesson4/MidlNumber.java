package com.company.lesson4;


public class MidlNumber {
    public void foundNumber(String[] args) {
        int amount = 1;
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += Double.parseDouble(args[i]);
            amount++;
        }
        System.out.println("Среднее значение вещественных чисел = " + (sum / amount));
    }
}

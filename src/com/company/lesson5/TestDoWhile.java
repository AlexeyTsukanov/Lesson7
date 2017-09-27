package com.company.lesson5;

public class TestDoWhile {
    public static void numbersPrint() {
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        } while (i++ <= 100);
    }
}

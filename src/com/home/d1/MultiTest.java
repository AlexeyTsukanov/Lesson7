package com.home.d1;

public class MultiTest {
    public static void main(String[] args) {
        makeMultiplicationTable();
    }

    private static final int MAX_INDEX_OF_MULTIPLICATION = 10;

    private static void makeMultiplicationTable() {
        for (int h = 1; h <= MAX_INDEX_OF_MULTIPLICATION; h++) {
            for (int i = 1; i <= MAX_INDEX_OF_MULTIPLICATION; i++) {
                int m = h * i;
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}

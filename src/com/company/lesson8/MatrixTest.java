package com.company.lesson8;

import java.util.Arrays;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();

        int[][] i = {{1,2,3,4}, {4,3,2,1}};

        matrix1.plus(i);
        System.out.println(Arrays.deepToString(i));
        int[][] test = matrix1.multiplication(5);
        System.out.println(Arrays.deepToString(test));
    }
}

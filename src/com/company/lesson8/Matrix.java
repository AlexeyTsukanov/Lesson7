package com.company.lesson8;

import java.util.Arrays;

public class Matrix {
    private int[][] inputArray;
    private int[][] array = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
    private int a = array.length;
    private int b = array[0].length;

    Matrix(int[][] array) {
        inputArray = array;
    }

    Matrix plus(Matrix matrix) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                matrix.inputArray[i][j] += array[i][j];
        }
        return matrix;
    }

    public int[][] getArray() {
        return inputArray;
    }

    Matrix multiplication(Matrix matrix, int a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                inputArray[i][j] *= a;
        }
        return matrix;
    }

    void print() {
        System.out.println(Arrays.deepToString(inputArray));
    }
}

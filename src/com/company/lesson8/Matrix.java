package com.company.lesson8;

import java.util.Arrays;

public class Matrix {
    private int[][] array;
    private int leng;
    private int height;

    Matrix(int[][] array) {
        this.array = array;
        leng = array.length;
        height = array[0].length;
    }
    Matrix(){}

    Matrix plus(Matrix matrix) {
        int[][] newArray = new int[leng][height];
        Matrix newMatrix = new Matrix(newArray);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                newMatrix.array[i][j] = matrix.array[i][j] + array[i][j];
        }
        return newMatrix;
    }

    public int[][] getArray() {
        return array;
    }

    Matrix multiplication(int a) {
        int[][] newArray = new int[leng][height];
        Matrix newMatrix = new Matrix(newArray);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                newMatrix.array[i][j] = array[i][j] *= a;
        }
        return newMatrix;
    }

    void print() {
        System.out.println(Arrays.deepToString(array));
    }
}

package com.company.lesson8;

import java.util.Arrays;

public class Matrix {
    int[][] array = {{1, 1, 1, 1}, {1, 1, 1, 1}};
    int a = array.length;
    int b = array[0].length;

    int[][] plus(int[][] inputArray) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                inputArray[i][j] += array[i][j];
        }
        return inputArray;
    }

    int[][] multiplication(int a) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                array[i][j] *= a;
        }
        return array;
    }

    void print() {
        System.out.println(Arrays.deepToString(array));
    }
}

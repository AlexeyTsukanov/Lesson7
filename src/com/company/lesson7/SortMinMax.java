package com.company.lesson7;

import java.util.Arrays;

public class SortMinMax {
    public static void sort() {
        int[][] array = {{3, 2, 1, 4, 5, 8, 7, 6}, {9, 10, 11, 12, 13, 14, 15, 16}, {17, 18, 19, 20, 21, 22, 23, 24}, {25, 26, 27, 28, 29, 30, 31, 32}, {33, 34, 35, 36, 37, 38, 39, 40}};
        System.out.println(Arrays.deepToString(array));
        array = newArray(array);
        System.out.println(Arrays.deepToString(array));
    }

    public static int[][] newArray(int[][] array) {
        int[][] newArray = {{0, 0}, {0, 0}, {0, 0}, {0, 0}, {0, 0}};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array[i].length - 1; j >= 0; j--) {
                for (int k = 0; k < j; k++) {
                    if (array[i][k + 1] < array[i][k]) {
                        int tmp = array[i][k + 1];
                        array[i][k + 1] = array[i][k];
                        array[i][k] = tmp;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            newArray[i][0] = array[i][0];
            newArray[i][1] = array[i][array[i].length - 1];
        }
        return newArray;
    }
}

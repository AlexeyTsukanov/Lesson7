package com.company.lesson7;

import java.util.Arrays;

public class NewBubblesSort {
    public static void print() {
        System.out.println(Arrays.toString(sort()));
    }

    public static int[] sort() {
        int[] array = {5, 1, 8, 9, 3};
        for (int i = array.length - 1; i >= 0; i--) {
            int end = 0;
            for (int j = 0; j < i; j++) {
                if (array[j + 1] > array[j]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    end++;
                }
            }
            if(end == 0) break;
        }
        return array;
    }
}

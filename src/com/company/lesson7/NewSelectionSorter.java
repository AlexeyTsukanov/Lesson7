package com.company.lesson7;

import java.util.Arrays;

public class NewSelectionSorter {
    public static void sort() {
        int[] array = {5, 0, 8, 9, 3};
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int k = i;
            int x = array[i];
            for (int j = i + 1; j < array.length; j++) {    // цикл выбора наименьшего элемента
                if (array[j] < x) {
                    k = j;    // k - индекс наименьшего элемента
                    x = array[j];
                }
            }
            if (x != array[i]) {
                array[k] = array[i];
                array[i] = x;    // меняем местами наименьший с array[i]
            } else ;
        }
        System.out.println(Arrays.toString(array));
    }
}

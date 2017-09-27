package com.company.lesson7;

public class SelectionSorter {
    public static void sort() {
        int[] array = {5, 1, 8, 9, 3};
        for (int i = 0; i < array.length; i++) { // i - номер текущего шага
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) { // цикл выбора наименьшего элемента
                if (array[j] < min) {
                    pos = j; // pos - индекс наименьшего элемент
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min; // меняем местами наименьший с array[i]
        }
    }
}

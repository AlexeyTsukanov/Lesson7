package com.company.lesson7;

import java.util.Arrays;

public class InverterTest {
    public static void invertion() {
        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
        testInvert(new int[]{2, 7, 5, 6, 0, 1, 9});
    }

    private static void testInvert(int[] arr) {
        System.out.print(Arrays.toString(arr) + " => ");
        ArrayInverter.invert(arr);
        System.out.println(Arrays.toString(arr));
    }
}

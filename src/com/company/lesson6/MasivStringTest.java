package com.company.lesson5;

public class MasivStringTest {
    public static void masivString() {
        String[][] list = new String[3][6];
        char c = 'a';
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 6; ) {
                list[i][k] = c + "" + ++k;
            }
            c++;
        }
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 6; k++) {
                System.out.print(list[i][k] + " ");
            }
            System.out.println();
        }
    }
}

package com.company.lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class Girland {
    public static void moov() {
        int random = (int) (Math.random() * 10000000);
        String str = Integer.toBinaryString(random);
        int[] gerland = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Лампочка замигает \n2. герлянда сдвинется \n3.проверка первой позиции.");
        int a = testInt(scanner);
        if (a > 0 && a <= 3) {
            switch (a) {
                case 1:
                    garlandShine(gerland, scanner);
                    break;
                case 2:
                    garlandMoove(gerland, scanner);
                    break;
                case 3:
                    chekGarland(gerland);
                    break;
            }
        }
    }

    private static void chekGarland(int[] gerland) {
        if (gerland[0] == 1) {
            System.out.println("Лампочки на первой позиции занята.");
        } else {
            System.out.println("лампочки на первой позиции не занята.");
        }
    }

    private static void garlandMoove(int[] gerland, Scanner scanner) {
        System.out.println("На сколько лампочек герлянда сдвинется влево?");
        int moov = testInt(scanner);
        for (int i = 0; i < moov; i++) {
            System.arraycopy(gerland, 1, gerland, 0, gerland.length - 1);
            System.out.println(Arrays.toString(gerland));
        }
    }

    private static void garlandShine(int[] array, Scanner scanner) {
        System.out.println("Введите, сколько раз лампочка замигает.");
        int shine = testInt(scanner);
        for (int j = 0; j < shine; j++) {
            for (int i = 0; i < array.length / 2; i++) {
                int tmp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = tmp;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static int testInt(Scanner scanner) {
        System.out.println("Введите число!");
        int numb = 0;
        if (scanner.hasNextInt()) {
            numb = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое число!");
        }
        return numb;
    }
}

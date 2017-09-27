package com.company.lesson5;

import java.util.Scanner;

public class NewGarland {
    public static void moov(Scanner scanner) {
        int number = testInt(scanner);
        System.out.println("1. Лампочка замигает \n2. герлянда сдвинется \n3.проверка первой позиции.");
        int a = testInt(scanner);
        if (a > 0 && a <= 3) {
            switch (a) {
                case 1:
                    garlandShine(scanner, number);
                    break;
                case 2:
                    garlandMoove(scanner, number);
                    break;
                case 3:
                    chekGarland(number);
                    break;
            }
        }
    }

    public static int testInt(Scanner scanner) {
        System.out.println("Введите число!");
        int numb = 0;
        if (scanner.hasNextInt()) {
            numb = scanner.nextInt();
        } else {
            notInt();
        }
        return numb;
    }

    public static void notInt() {
        System.out.println("Вы ввели не целое число!");
    }

    public static void garlandMoove(Scanner scanner, int number) {
        System.out.println("На сколько лампочек герлянда сдвинется влево?");
        int moov = testInt(scanner);
        for (int i = 0; i < moov; i++) {
            number <<= 2;
            print(number);
        }

    }

    public static void print(int number) {
        System.out.println(Integer.toBinaryString(number));
    }

    public static void garlandShine(Scanner scanner, int number) {
        System.out.println("Введите, сколько раз лампочка замигает.");
        int shine = testInt(scanner);
        for (int i = 0; i < shine; i++) {
            number = ~number;
            print(number);
        }
    }

    public static void chekGarland(int number) {
        int mask = 0b10000000000000000000000000000000;
        int a = number & mask;
        if (mask == a) {
            System.out.println("Лампочки на первой позиции занята.");
        } else {
            System.out.println("лампочки на первой позиции не занята.");
        }
    }
}
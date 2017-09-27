package com.company.lesson4;

import java.util.Scanner;

public class Garland {
    public void moov(Scanner scanner) {
        System.out.println("Введите число!");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            garlandShine(scanner, number);
            garlandMoove(scanner, number);
            chekGarland(number);
        } else {
            notInt();
        }
    }

    public void notInt() {
        System.out.println("Вы ввели не целое число!");
        System.exit(0);
    }

    public void garlandMoove(Scanner scanner, int number) {
        System.out.println("На сколько лампочек герлянда сдвинется влево?");
        if (scanner.hasNextInt()) {
            int moov = scanner.nextInt();
            for (int i = 0; i < moov; i++) {
                number <<= 2;
                print(number);
            }
        } else {
            notInt();
        }
    }

    public void print(int number) {
        System.out.println(Integer.toBinaryString(number));
    }

    public void garlandShine(Scanner scanner, int number) {
        System.out.println("Введите, сколько раз лампочка замигает.");
        if (scanner.hasNextInt()) {
            int shine = scanner.nextInt();
            for (int i = 0; i < shine; i++) {
                number = ~number;
                print(number);
            }
        } else {
            notInt();
        }
    }

    public void chekGarland(int number) {
        int mask = 0b10000000000000000000000000000000;
        int a = number & mask;
        if (mask == a) {
            System.out.println("Лампочки на первой позиции занята.");
        } else {
            System.out.println("лампочки на первой позиции не занята.");
        }
    }
}

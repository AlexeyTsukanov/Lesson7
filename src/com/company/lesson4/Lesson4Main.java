package com.company.lesson4;

import java.util.Scanner;

public class Lesson4Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую операцию выполнить? \n1. Поиск большего по модулю. " +
                "\n2. Герлянда. \n3. Поиск среднего значения.\n4. Вывод нечетных чисел. \n5. Проверка числа.");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (a == 1) {
                Modul modul = new Modul();
                modul.biggestNumber(scanner);
            } else if (a == 2) {
                Garland garland = new Garland();
                garland.moov(scanner);
            } else if (a == 3) {
                MidlNumber number = new MidlNumber();
                number.foundNumber(args);
            } else if (a == 4) {
                ChetNechet number = new ChetNechet();
                number.foundNumber(args);
            } else if (a == 5) {
                ZeroToTen number = new ZeroToTen();
                number.foundNumber(scanner);
            }
        } else {
            System.out.println("Введите число от 1 до 5!");
        }
    }
}

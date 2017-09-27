package com.company.lesson4;

import java.util.Scanner;

public class Modul {
    public void biggestNumber(Scanner scanner) {
        int a, b, c;
        a = getNumb(scanner);
        b = getNumb(scanner);
        c = getNumb(scanner);
        int mathA = Math.abs(a);
        int mathB = Math.abs(b);
        int mathC = Math.abs(c);
        System.out.print("Меньшее число по модулю: ");
        if (mathA <= mathB && mathA <= mathC) {
            System.out.println(a);
        } else if (mathB <= mathA && mathB <= mathC) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public int getNumb(Scanner scanner) {
        int number = 0;
        System.out.println("Введите число");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Вы ввели не целое число!");
            System.exit(0);
        }
        return number;
    }
}

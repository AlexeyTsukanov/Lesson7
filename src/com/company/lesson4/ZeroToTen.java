package com.company.lesson4;

import java.util.Scanner;

public class ZeroToTen {
    public void foundNumber(Scanner scanner){
        System.out.println("Введите целое число.");
        if (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number >= 0 && number <= 10){
                System.out.println("Положительное число меньше 10");
            }
            else {
                System.out.println("Положительное число больше 10 или отрицательное");
            }
        }
        else {
            System.out.println("Вы ввели не цеое число!");
        }
    }
}

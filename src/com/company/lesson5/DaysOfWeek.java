package com.company.lesson5;

public class DaysOfWeek {
    public static void daysOut(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int numb = Integer.parseInt(args[i]);
            if (numb > 0 && numb <= 7) {
                if (numb == 1) {
                    System.out.println("Понедельник");
                } else if (numb == 2) {
                    System.out.println("Вторник");
                } else if (numb == 3) {
                    System.out.println("Среда");
                } else if (numb == 4) {
                    System.out.println("Четверг");
                } else if (numb == 5) {
                    System.out.println("Пятница");
                } else {
                    System.out.println("Выходной");
                }
            }
        }
    }
}

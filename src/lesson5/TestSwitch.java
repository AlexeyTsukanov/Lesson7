package com.company.lesson5;

public class TestSwitch {
    public static void testSwitch(String[] args) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "1":
                    System.out.println("Понедельник");
                    break;
                case "2":
                    System.out.println("Вторник");
                    break;
                case "3":
                    System.out.println("Среда");
                    break;
                case "4":
                    System.out.println("Четверг");
                    break;
                case "5":
                    System.out.println("Пятница");
                    break;
                default:
                    System.out.println("Выходной");
                    break;
            }
        }
    }
}

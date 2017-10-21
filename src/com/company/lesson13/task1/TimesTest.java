package com.company.lesson13.task1;

public class TimesTest {
    public static void main(String[] args) {
        for (int i = 0; i < TimesOfYear.values().length; i++) {
            System.out.print(TimesOfYear.values()[i].getName() + " ");
            System.out.print(TimesOfYear.values()[i].getTemperature() + " ");
            System.out.println(TimesOfYear.values()[i].getDescription());
        }

        String myFavoriteTime = TimesOfYear.valueOf("SUMMER").getName() + " " + TimesOfYear.valueOf("SUMMER").getTemperature() + " " + TimesOfYear.valueOf("SUMMER").getDescription();
        System.out.println("Мое любимое время года " + myFavoriteTime);

        switch (TimesOfYear.valueOf("SUMMER")) {
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }

    }
}

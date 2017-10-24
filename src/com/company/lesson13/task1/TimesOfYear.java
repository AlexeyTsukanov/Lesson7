package com.company.lesson13.task1;

public enum TimesOfYear {
    WINTER("Зима", -10),
    SPRING("Весна", 15),
    SUMMER("Лето", 30) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN("Осень", 10);

    private int temperature;
    private String name;

    TimesOfYear(String name, int temperature) {
        this.temperature = temperature;
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    public String getName() {
        return name;
    }
}

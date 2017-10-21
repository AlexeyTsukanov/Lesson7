package com.company.lesson13.task1;

public enum TimesOfYear {
    WINTER("Зима", -10, "Холодное время года"),
    SPRING("Весна", 15, "Холодное время года"),
    SUMMER("Лето", 30, "Теплое время года"),
    AUTUMN("Осень", 10, "Холодное время года");

    private int temperature;
    private String description;
    private String name;

    TimesOfYear(String name, int temperature, String description) {
        this.temperature = temperature;
        this.description = description;
        this.name = name;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}

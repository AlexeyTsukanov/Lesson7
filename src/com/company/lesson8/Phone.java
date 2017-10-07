package com.company.lesson8;

public class Phone {
    String number;
    String model;
    double weight;

    Phone() {
    }

    Phone(String n, String m, double w) {
        this();
        number = n;
        model = m;
        weight = w;
    }

    void receiveCall(String name, String number) {
        System.out.println("Вам звонит: " + name + "\nНомер телефона: " + number);
    }

    void info() {
        System.out.println("Номер: " + number + " Модель: " + model + " Вес: " + weight);
    }

    void receiveCall(String name) {
        System.out.println("Звонит {" + name + "}");
    }

    String getPhoneNumber() {
        return number;
    }
}

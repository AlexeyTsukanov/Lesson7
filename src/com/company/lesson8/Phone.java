package com.company.lesson8;

public class Phone {
    String number;
    String model;
    double weight;
    private static int count = 0;

    Phone() {
        count++;
    }

    Phone(String n, String m, double w) {
        this();
        number = n;
        model = m;
        weight = w;
    }

    static int getCount() {
        return count;
    }

    public void receiveCall(String name, String number) {
        System.out.println("Вам звонит: " + name + "\nНомер телефона: " + number);
    }

    public void info() {
        System.out.println("Номер: " + number + " Модель: " + model + " Вес: " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит {" + name + "}");
    }

    public String getPhoneNumber() {
        return number;
    }

    public void sendMessage(String sendNumber) {
        System.out.println(sendNumber);
    }

    protected void finalize() {
        System.out.println("In finalize");
        count--;
    }
}

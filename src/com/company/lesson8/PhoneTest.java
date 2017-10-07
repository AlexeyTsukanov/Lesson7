package com.company.lesson8;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone("0573892756", "Sony", 190.9);

        phone1.number = "0954893817";
        phone1.model = "iPhone";
        phone1.weight = 142.17;

        phone2.number = "0671892736";
        phone2.model = "Nokia";
        phone2.weight = 300;

        phone3.number = "0956789302";
        phone3.model = "asus";
        phone3.weight = 210.67;

        System.out.println(phone1.getPhoneNumber());
        System.out.println(phone2.getPhoneNumber());
        System.out.println(phone3.getPhoneNumber());

        phone1.receiveCall("Dima");
        phone2.receiveCall("Nik");
        phone3.receiveCall("Vasya");

        phone1.receiveCall("Petya", "0959387611");
        phone4.info();
    }
}
